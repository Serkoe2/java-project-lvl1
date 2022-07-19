package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

public class Even implements Game {

    @Override
    public final String getDescription() {
        return  "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public final String getQuestion(Engine gameEngine) {
        return String.valueOf(gameEngine.getRandom());
    }

    @Override
    public final String getAnswer(String question) {
        int number = Integer.parseInt(question);
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }
}
