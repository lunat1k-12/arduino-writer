package com.serial;

import com.fazecast.jSerialComm.SerialPort;
import com.serial.service.WriterService;
import com.serial.state.WriteState;

public class ArduinoSerial {

    public static void main(String[] args) {
        SerialPort sp = SerialPort.getCommPort("/dev/cu.HC-06-SPPDev");
        sp.setComPortParameters(9600, 8, 1, 0); // default connection settings for Arduino
        sp.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0); // block until bytes can be written

        WriteState state = new WriteState();
        WriterService service = new WriterService(state);

        try {
            service.printText(sp, args[0]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
