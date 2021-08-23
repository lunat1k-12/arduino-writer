package com.serial.util;

import java.util.List;

public class SerialUtil {

    public static List<String> toList(int[] pos) {
        return List.of(
                Integer.toString(pos[0]),
                Integer.toString(pos[1]),
                Integer.toString(pos[2])
        );
    }
}
