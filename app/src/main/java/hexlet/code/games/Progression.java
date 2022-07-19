package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

public class Progression implements Game {
    private int result;
    @Override
    public final String getDescription() {
        return  "Find the greatest common divisor of given numbers.";
    }

    @Override
    public final String getQuestion(Engine gameEngine) {
        int lengthProgression = gameEngine.getRandom(7) + 5;
        int position = lengthProgression - gameEngine.getRandom(lengthProgression);
        int step = gameEngine.getRandom();
        int nextNumber = gameEngine.getRandom();
        String question = "";

        // make progression
        while (lengthProgression != 0) {
            if (lengthProgression == position) {
                question += " .. ";
                this.result = nextNumber;
                nextNumber += step;
            } else {
                question += " " + String.valueOf(nextNumber) + " ";
                nextNumber += step;
            }
            lengthProgression--;
        }
        return question;
    }

    @Override
    public final String getAnswer(String question) {
        return String.valueOf(this.result);
    }

}
