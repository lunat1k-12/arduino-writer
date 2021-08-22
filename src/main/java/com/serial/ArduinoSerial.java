package com.serial;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static com.fazecast.jSerialComm.SerialPort.LISTENING_EVENT_DATA_RECEIVED;

public class ArduinoSerial implements SerialPortDataListener {

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
        for (ServoValues value : T_LETTER) {
            while (!isReady) {
                Thread.sleep(1000);
            }
            sp.getOutputStream().write(String.join(",", value.toList()).getBytes(StandardCharsets.UTF_8));
            sp.getOutputStream().flush();
            isReady = false;
        }

        for (ServoValues value : GH_LETTER) {
            while (!isReady) {
                Thread.sleep(1000);
            }
            sp.getOutputStream().write(String.join(",", value.toList()).getBytes(StandardCharsets.UTF_8));
            sp.getOutputStream().flush();
            isReady = false;
        }

        if (sp.closePort()) {
            System.out.println("Port is closed :)");
        } else {
            System.out.println("Failed to close port :(");
            return;
        }
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
