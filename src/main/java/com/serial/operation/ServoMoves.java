package com.serial.operation;

public class ServoMoves {
    private final DrawOperation servo1;
    private final DrawOperation servo2;
    private final DrawOperation servo3;

    public ServoMoves(DrawOperation servo1,
                      DrawOperation servo2,
                      DrawOperation servo3) {
        this.servo1 = servo1;
        this.servo2 = servo2;
        this.servo3 = servo3;
    }

    public int[] countPositions(int[] current) {
        return new int[] {
                servo1.countPosition(current[0]),
                servo2.countPosition(current[1]),
                servo3.countPosition(current[2])
        };
    }
}
