package com.serial.service;

import com.fazecast.jSerialComm.SerialPort;
import com.serial.listener.BluetoothListener;
import com.serial.mapping.LetterMoves;
import com.serial.operation.ServoMoves;
import com.serial.state.WriteState;
import com.serial.util.SerialUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriterService {

    private static int line[] = new int[]{120, 73, 95};
    private final WriteState state;

    public WriterService(WriteState state) {
        this.state = state;
    }

    public void printText(SerialPort sp, String text) throws IOException, InterruptedException {
        if (sp.openPort()) {
            System.out.println("Port is open :)");
        } else {
            System.out.println("Failed to open port :(");
            return;
        }

        sp.addDataListener(new BluetoothListener(state));

        Thread.sleep(5000);
        int[] pos = Arrays.copyOf(line, line.length);
        sp.getOutputStream().write(buildCommand(pos).getBytes(StandardCharsets.UTF_8));
        sp.getOutputStream().flush();
        state.setNotReady();

        while (state.isNotReady()) {
            Thread.sleep(500);
        }

        List<ServoMoves> moves = getMoves(text);
        Integer currentMove = 1;
        for (ServoMoves move : moves) {
            while (state.isNotReady()) {
                Thread.sleep(500);
            }
            pos = move.countPositions(pos);
            sp.getOutputStream().write(buildCommand(pos).getBytes(StandardCharsets.UTF_8));
            sp.getOutputStream().flush();
            System.out.printf("\rMove: %s:%s", currentMove, moves.size());
            currentMove++;
            state.setNotReady();
        }

        while (state.isNotReady()) {
            Thread.sleep(500);
        }

        if (sp.closePort()) {
            System.out.println("Port is closed :)");
        } else {
            System.out.println("Failed to close port :(");
        }
    }

    public static String buildCommand(int[] pos) {
        return String.join(",", SerialUtil.toList(pos));
    }

    public static List<ServoMoves> getMoves(String message) {
        List<ServoMoves> moves = new ArrayList<>();
        for (char letter : message.toUpperCase().toCharArray()) {
            moves.addAll(LetterMoves.getByLetter(letter).getOperations());
        }
        return moves;
    }
}
