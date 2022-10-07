package DesignSnakeAndLadderGame;

import DesignSnakeAndLadderGame.model.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Game {
    private final Dice dice;
    private final Deque<Player> playersList;
    private final Board board;
    private final int endPosition;
    private Player winner;

    public Game() {
        board = new Board(10, 5, 4);
        endPosition = board.getBoardSize() * board.getBoardSize() - 1;
        dice = new Dice(1);
        playersList = new ArrayDeque<>(List.of(new Player("Sanjay", 0), new Player("Sagar", 0)));
    }

    public void startGame() {
        while (winner == null) {
            Player currentPlayer = getCurrentPlayer();
            System.out.println("Current Player: " + currentPlayer.getId());
            int diceValue = dice.rollDice();
            System.out.println("The dice value: " + diceValue);
            int newPosition = jumpCheck(currentPlayer.getPosition() + diceValue);
            if (newPosition >= endPosition)
                winner = currentPlayer;
            if (winner == null) {
                currentPlayer.setPosition(newPosition);
                System.out.println(currentPlayer.getId() + "'s new position is: " + currentPlayer.getPosition());
            }
        }
        System.out.println("==== Game End ======");
        System.out.println("Winner is: " + winner.getId());

    }

    private Player getCurrentPlayer() {
        Player player = playersList.poll();
        playersList.offer(player);
        return player;
    }

    private int jumpCheck(int position) {
        if (position >= endPosition)
            return position;
        Cell cell = board.getCell(position);
        Jump jump = cell.getJump();
        int newPosition = position;
        if (jump != null && jump.getStart() == position) {
            String jumpBy = jump.getStart() > jump.getEnd() ? "Snake" : "Ladder";
            newPosition = jump.getEnd();
            System.out.println("Player found a " + jumpBy);
        }
        return newPosition;
    }
}
