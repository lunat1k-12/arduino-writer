package com.serial.state;

public class WriteState {

    private volatile boolean isReady = true;

    public synchronized boolean isNotReady() {
        return !isReady;
    }

    public synchronized void setReady() {
        isReady = true;
    }

    public synchronized void setNotReady() {
        isReady = false;
    }
}
