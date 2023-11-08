package com.duckrace.app;

import com.duckrace.Board;
import com.duckrace.Reward;

import java.util.Scanner;

/*
* Application "controller" class.
* It directs the overall flow/sequence of the application
*
 */
public class RuckRaceApp {
    private final Board board = new Board();
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        //coding by intention
        welcome();
        showBoard();
        int id = promptForId();
        Reward reward = promptForReward();  // please enter the id of the duck to win: will return id of the winner
        updateBoard(id, reward);
        showBoard();
    }

    private void updateBoard(int id, Reward reward) {
        board.update(id, reward);
    }

    private Reward promptForReward() {
        Reward reward = null;

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please [D]ebit card or [P]rizes: ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("D|P")) {
            validInput = true;}
            // use ternary operator to check if input is valid
            validInput = true;
            reward = ("D".equals(input))? Reward.DEBIT_CARD : Reward.PRIZES;
            System.out.println(reward);
        }

        return reward;
    }

    private int promptForId() {
        int id = 0;

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter id of the winner [1-19]: ");  //Don't hardcode 19
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{1,2}")) {
                id = Integer.parseInt(input);
                if (1 <= id && id <= 19) {
                    validInput = true;
                }
            }
        }
        return id;
    }

    private void showBoard() {
        board.show();
    }

    private void updateBoard() {
        board.update();
    }


    private void welcome() {
        System.out.println("Welcome to the Duck Race!");
    }
}
