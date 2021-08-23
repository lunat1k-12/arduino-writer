package com.serial.operation;

public class IncreaseDrawOperation implements DrawOperation {

    private final Integer value;

    private IncreaseDrawOperation(int value) {
       this.value = value;
    }

    public static IncreaseDrawOperation of(int value) {
        return new IncreaseDrawOperation(value);
    }

    @Override
    public int countPosition(int currentPos) {
        return currentPos + value;
    }
}
