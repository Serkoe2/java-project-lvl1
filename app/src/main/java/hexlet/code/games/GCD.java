package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

public class GCD implements Game {
    private int result;
    private String questionFormat = "%s %s";
    @Override
    public final String getDescription() {
        return  "Find the greatest common divisor of given numbers.";
    }

    @Override
    public final String getQuestion(Engine gameEngine) {
        int numberOne = gameEngine.getRandom();
        int numberTwo = gameEngine.getRandom();
        if (numberOne < numberTwo) {
            this.result = this.findGCD(numberTwo, numberOne);
        } else {
            this.result = this.findGCD(numberOne, numberTwo);
        }
        return String.format(questionFormat, numberOne, numberTwo);
    }

    @Override
    public final String getAnswer(String question) {
        return String.valueOf(this.result);
    }

    private int findGCD(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }
        return findGCD(numberTwo, numberOne % numberTwo);
    }
}
