package DesignSnakeAndLadderGame.model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private static final int MAX = 6;
    private static final int MIN = 1;

    private int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int totalSum = 0;
        int rollsRemaining = 0;
        while (rollsRemaining < diceCount) {
            totalSum += ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
            rollsRemaining++;
        }
        return totalSum;
    }
}
