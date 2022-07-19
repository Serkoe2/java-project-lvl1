package hexlet.code;

public interface Game {
    String getDescription();
    String getQuestion(Engine engine);
    String getAnswer(String question);
}
