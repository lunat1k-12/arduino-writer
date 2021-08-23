package com.serial.operation;

public class DecreaseDrawOperation implements DrawOperation{

    private final Integer value;

    private DecreaseDrawOperation(int value) {
        this.value = value;
    }

    public static DecreaseDrawOperation of(int value) {
        return new DecreaseDrawOperation(value);
    }

    @Override
    public int countPosition(int currentPos) {
        return currentPos - value;
    }
}
