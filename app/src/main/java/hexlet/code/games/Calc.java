package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;


public class Calc implements Game {
    private int result;
    private String questionFormat = "%s %c %s";

    @Override
    public final String getDescription() {
        return  "What is the result of the expression?";
    }
    @Override
    public final String getQuestion(Engine gameEngine) {
        char operator;
        int firstNumber = gameEngine.getRandom();
        int secondNumber = gameEngine.getRandom();
        final int genVariations = 3;

        switch (gameEngine.getRandom(genVariations)) {
            case 0:
                this.result = firstNumber + secondNumber;
                operator = '+';
                break;
            case 1:
                this.result = firstNumber - secondNumber;
                operator = '-';
                break;
            case 2:
                this.result = firstNumber * secondNumber;
                operator = '*';
                break;
            default:
                operator = '+';
        }
        return String.format(this.questionFormat, String.valueOf(firstNumber), operator, String.valueOf(secondNumber));
    }

    @Override
    public final String getAnswer(String question) {
        return String.valueOf(this.result);
    }
}
