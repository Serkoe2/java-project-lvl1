package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Game;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    final Random generator = new Random();
    final String badMessage = "'%s' is wrong answer ;(. Correct answer was '%s'\nLet's try again, %s!";
    final String winMessage = "Congratulation %s!";
    static int needWinsInRow = 3;

    int maxRandomNumber = 1000;

    public int getRandom() {
        return generator.nextInt(maxRandomNumber);
    }

    public void startGame(Scanner sc, String playerName, Game game) {
        String userAnswer;
        String question;
        String result;
        int leftWinsInRow = this.needWinsInRow;

        System.out.print("Answer 'yes' if number even otherwise answer 'no'.");
        while (leftWinsInRow != 0) {
            question = game.getQuestion(this);
            System.out.print("Question: " + question + "\nYour answer: ");
            if (sc.hasNextLine()) {
                userAnswer = sc.nextLine();
            } else {
                userAnswer = "";
            }
            result = game.getAnswer(question);
            if (result.equals(userAnswer)) {
                System.out.println("Correct!");
                leftWinsInRow--;
            } else {
                System.out.println(String.format(this.badMessage, userAnswer, result, playerName));
                leftWinsInRow = this.needWinsInRow;
            }
        }
        System.out.println(String.format("Congratulations, %s!", playerName));
    }

}
