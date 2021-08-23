package com.serial.mapping;

import com.serial.operation.DecreaseDrawOperation;
import com.serial.operation.IncreaseDrawOperation;
import com.serial.operation.ServoMoves;
import com.serial.operation.SleepOperation;

import java.util.List;

public enum LetterMoves {
    T_LETTER('Т', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(15), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get())
    )),

    GH_LETTER('Ы', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(10), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get())
    )),

    SPACE(' ', List.of(new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()))),

    P_LETTER('П', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get())
    ));

    LetterMoves(char letter, List<ServoMoves> operations) {
        this.operations = operations;
        this.letter = letter;
    }

    private final char letter;
    private final List<ServoMoves> operations;

    public static LetterMoves getByLetter(char letter) {
        for (LetterMoves move : LetterMoves.values()) {
            if (move.getLetter() == letter) {
                return move;
            }
        }
        return null;
    }

    public List<ServoMoves> getOperations() {
        return operations;
    }

    public char getLetter() {
        return letter;
    }
}
