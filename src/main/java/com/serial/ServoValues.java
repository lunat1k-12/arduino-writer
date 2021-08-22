package com.serial;

import java.util.List;

public class ServoValues {

    private Integer servo1;
    private Integer servo2;
    private Integer servo3;

    public ServoValues(int servo1, int servo2, int servo3) {
        this.servo1 = servo1;
        this.servo2 = servo2;
        this.servo3 = servo3;
    }

    public int getServo1() {
        return servo1;
    }

    public void setServo1(int servo1) {
        this.servo1 = servo1;
    }

    public int getServo2() {
        return servo2;
    }

    public void setServo2(int servo2) {
        this.servo2 = servo2;
    }

    public int getServo3() {
        return servo3;
    }

    public void setServo3(int servo3) {
        this.servo3 = servo3;
    }

    public List<String> toList() {
        return List.of(servo1.toString(), servo2.toString(), servo3.toString());
    }
}
