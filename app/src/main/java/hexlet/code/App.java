package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final Engine gameEngine = new Engine();
        Cli.menu(sc, gameEngine);
        sc.close();
    }
}
