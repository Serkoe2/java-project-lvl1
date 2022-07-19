package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private Random generator = new Random();
    private String badMessage = "'%s' is wrong answer ;(. Correct answer was '%s'\nLet's try again, %s!";
    private String winMessage = "Congratulation %s!";
    private final int needWinsInRow = 3;

    private final int maxRandomNumber = 1000;

    public final int getRandom() {
        return generator.nextInt(maxRandomNumber);
    }

    public final int getRandom(int max) {
        return generator.nextInt(max);
    }

    public final void startGame(Scanner sc, String playerName, Game game) {
        String userAnswer;
        String question;
        String result;
        int leftWinsInRow = this.needWinsInRow;

        String gameDescription = game.getDescription();
        System.out.println(gameDescription);
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
