package com.serial;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.serial.mapping.LetterMoves;
import com.serial.operation.ServoMoves;
import com.serial.util.SerialUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.fazecast.jSerialComm.SerialPort.LISTENING_EVENT_DATA_RECEIVED;

public class ArduinoSerial implements SerialPortDataListener {

    private static int firstLine[] = new int[]{120, 80, 130};
    private static int secondLine[] = new int[]{120, 80, 90};

    private static volatile boolean isReady = true;
    private static final List<ServoValues> T_LETTER = List.of(
            new ServoValues(120, 75, 90),
            new ServoValues(120, 80, 90),
            new ServoValues(120, 80, 80),
            new ServoValues(120, 75, 90),
            new ServoValues(125, 75, 90),
            new ServoValues(125, 80, 90),
            new ServoValues(115, 80, 90),
            new ServoValues(115, 75, 90)
    );

    private static final List<ServoValues> T_LETTER_UP = List.of(
            new ServoValues(120, 85, 130),
            new ServoValues(120, 90, 130),
            new ServoValues(120, 90, 120),
            new ServoValues(120, 85, 130),
            new ServoValues(125, 85, 130),
            new ServoValues(125, 90, 130),
            new ServoValues(105, 90, 130),
            new ServoValues(115, 85, 130)
    );

    private static final List<ServoValues> GH_LETTER = List.of(
            new ServoValues(110, 75, 90),
            new ServoValues(110, 80, 90),
            new ServoValues(110, 80, 80),
            new ServoValues(110, 75, 80),
            new ServoValues(110, 80, 80),
            new ServoValues(105, 80, 80),
            new ServoValues(105, 75, 80),
            new ServoValues(105, 80, 80),
            new ServoValues(105, 80, 85),
            new ServoValues(105, 75, 85),
            new ServoValues(105, 80, 85),
            new ServoValues(110, 80, 85),
            new ServoValues(110, 75, 85),
            new ServoValues(100, 75, 90),
            new ServoValues(100, 80, 90),
            new ServoValues(100, 80, 80),
            new ServoValues(100, 75, 80)
    );

    public static void main(String[] args) throws IOException, InterruptedException {
        SerialPort sp = SerialPort.getCommPort("/dev/cu.usbserial-14640"); // device name TODO: must be changed
        sp.setComPortParameters(9600, 8, 1, 0); // default connection settings for Arduino
        sp.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0); // block until bytes can be written

        if (sp.openPort()) {
            System.out.println("Port is open :)");
        } else {
            System.out.println("Failed to open port :(");
            return;
        }

        sp.addDataListener(new ArduinoSerial());

        Thread.sleep(3000);
        int[] pos = Arrays.copyOf(secondLine, secondLine.length);
        isReady = false;
        sp.getOutputStream().write(String.join(",", SerialUtil.toList(pos)).getBytes(StandardCharsets.UTF_8));
        sp.getOutputStream().flush();
        while (!isReady) {
            Thread.sleep(1000);
        }

        List<ServoMoves> moves = getMoves("ты п");
        for (ServoMoves move :moves) {
            pos = move.countPositions(pos);
            while (!isReady) {
                Thread.sleep(1000);
            }
            sp.getOutputStream().write(String.join(",", SerialUtil.toList(pos)).getBytes(StandardCharsets.UTF_8));
            sp.getOutputStream().flush();
            isReady = false;
        }

        while (!isReady) {
            Thread.sleep(1000);
        }
//        for (ServoValues value : T_LETTER) {
//            while (!isReady) {
//                Thread.sleep(1000);
//            }
//            sp.getOutputStream().write(String.join(",", value.toList()).getBytes(StandardCharsets.UTF_8));
//            sp.getOutputStream().flush();
//            isReady = false;
//        }
//
//        for (ServoValues value : T_LETTER_UP) {
//            while (!isReady) {
//                Thread.sleep(1000);
//            }
//            sp.getOutputStream().write(String.join(",", value.toList()).getBytes(StandardCharsets.UTF_8));
//            sp.getOutputStream().flush();
//            isReady = false;
//        }

        if (sp.closePort()) {
            System.out.println("Port is closed :)");
        } else {
            System.out.println("Failed to close port :(");
            return;
        }
    }

    public static List<ServoMoves> getMoves(String message) {
        List<ServoMoves> moves = new ArrayList<>();
        for (char letter : message.toUpperCase().toCharArray()) {
            moves.addAll(LetterMoves.getByLetter(letter).getOperations());
        }
        return moves;
    }
    @Override
    public int getListeningEvents() {
        return LISTENING_EVENT_DATA_RECEIVED;
    }

    @Override
    public void serialEvent(SerialPortEvent event) {
        if (event.getEventType() == LISTENING_EVENT_DATA_RECEIVED) {
            byte[] temp = event.getReceivedData();
            String message = new String(temp);
            message = message.trim();
            System.out.println(message);
            if ("Done".equals(message)) {
                System.out.println("ready again");
                isReady = true;
            }
        }
    }
}
