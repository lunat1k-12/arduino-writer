package com.serial.listener;

import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.serial.state.WriteState;

import java.nio.charset.StandardCharsets;

import static com.fazecast.jSerialComm.SerialPort.LISTENING_EVENT_DATA_RECEIVED;

public class BluetoothListener implements SerialPortDataListener {

    private final StringBuilder response;
    private final WriteState state;

    public BluetoothListener(WriteState state) {
        this.state = state;
        this.response = new StringBuilder();
    }

    @Override
    public int getListeningEvents() {
        return LISTENING_EVENT_DATA_RECEIVED;
    }

    @Override
    public void serialEvent(SerialPortEvent event) {
        if (event.getEventType() == LISTENING_EVENT_DATA_RECEIVED) {
            byte[] temp = event.getReceivedData();
            String message = new String(temp, StandardCharsets.UTF_8);
            message = message.trim();
            response.append(message);
            if (response.toString().contains("done;")) {
                System.out.println("ready again");
                response.setLength(0);
                state.setReady();
            }
        }
    }
}
