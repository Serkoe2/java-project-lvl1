package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even implements Game{

    @Override
    public String getQuestion(Engine gameEngine) {
        return String.valueOf(gameEngine.getRandom());
    }

    @Override
    public String getAnswer(String question) {
        int number = Integer.parseInt(question);
        if (number % 2 == 0)
            return "yes";
        return "no";
    }
}
