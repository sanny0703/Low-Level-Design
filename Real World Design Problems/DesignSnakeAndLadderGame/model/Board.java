package DesignSnakeAndLadderGame.model;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private final Set<Integer> usedCells;
    private Cell[][] cells;
    private int boardSize;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        this.boardSize = boardSize;
        usedCells = new HashSet<>();
        initializeCells(boardSize);
        addSnakesAndLadders(numberOfSnakes, numberOfLadders);
    }

    public int getBoardSize() {
        return boardSize;
    }


    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesAndLadders(int numberOfSnakes, int numberOfLadders) {
        // let's initialize snakes first.
        while (numberOfSnakes > 0) {
            // we can't have snake at start position 0, and end position boardSize*boardSize-1
            int snakeHead = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);
            if (snakeTail >= snakeHead || usedCells.contains(snakeHead))
                continue;
            usedCells.add(snakeHead);
            Cell cell = getCell(snakeHead);
            cell.setJump(new Jump(snakeHead, snakeTail));
            numberOfSnakes--;
        }
        // let's initialize ladders now.
        while (numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, boardSize * boardSize - 1);
            if (ladderEnd <= ladderStart || usedCells.contains(ladderStart))
                continue;
            usedCells.add(ladderStart);
            Cell cell = getCell(ladderStart);
            cell.setJump(new Jump(ladderStart, ladderEnd));
            numberOfLadders--;
        }
    }

    public Cell getCell(int position) {
        int row = position / boardSize;
        int col = position % boardSize;
        return cells[row][col];
    }
}
