package com.duckrace;
import static com.duckrace.Reward.*;

class BoardTest {
    public static void main(String[] args) {
        Board board = new Board();
        // board.dumpStudent
        board.update(5, DEBIT_CARD);
        board.update(5, PRIZES);
        board.update(9, DEBIT_CARD);
        board.update(9, PRIZES);
        board.update(4, DEBIT_CARD);
        board.update(4, PRIZES);
        board.update(13, PRIZES);
        board.update(13, PRIZES);
        board.update(6, DEBIT_CARD);

        board.show();
    }
}