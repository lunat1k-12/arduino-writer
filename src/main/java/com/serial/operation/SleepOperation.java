package com.serial.operation;

public class SleepOperation implements DrawOperation {

    private SleepOperation() {}

    public static SleepOperation get() {
        return new SleepOperation();
    }

    @Override
    public int countPosition(int currentPos) {
        return currentPos;
    }
}
