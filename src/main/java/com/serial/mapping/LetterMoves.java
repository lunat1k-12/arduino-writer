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
            new ServoMoves(DecreaseDrawOperation.of(10), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
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
    )),

    I_LETTER('И', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get())
            )),
    D_LETTER('Д', List.of(
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(7)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(11), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(3)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(3)),
            new ServoMoves(IncreaseDrawOperation.of(11), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(3)),
            new ServoMoves(DecreaseDrawOperation.of(3), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(6)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(3)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(5)),
            new ServoMoves(DecreaseDrawOperation.of(8), SleepOperation.get(), SleepOperation.get())
    )),

    O_LETTER('О', List.of(
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
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(10), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10))
    )),

    R_LETTER('Р', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(10), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(5))
    )),

    A_LETTER('А', List.of(
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
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(8), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(13), SleepOperation.get(), SleepOperation.get())
    )),

    B_LETTER('Б', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get())
    )),

    V_LETTER('В', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(7), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(IncreaseDrawOperation.of(7), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(3)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(7), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(5)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get())
    )),

    G_LETTER('Г', List.of(
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), DecreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), SleepOperation.get(), IncreaseDrawOperation.of(10)),
            new ServoMoves(SleepOperation.get(), IncreaseDrawOperation.of(5), SleepOperation.get()),
            new ServoMoves(DecreaseDrawOperation.of(5), SleepOperation.get(), SleepOperation.get()),
            new ServoMoves(SleepOperation.get(), DecreaseDrawOperation.of(5), SleepOperation.get()),
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
