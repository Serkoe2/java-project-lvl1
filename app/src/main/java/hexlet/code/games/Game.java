package hexlet.code.games;

import hexlet.code.Engine;

public interface Game{
    public String getQuestion(Engine engine);
    public String getAnswer(String question);
}