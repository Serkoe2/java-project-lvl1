package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Cli {

    public static void menu(Scanner sc, Engine gameEngine) {
        String name;
        Game game;
        int choice = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit");
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Your choice: " + Integer.toString(choice) + "\n");
        switch (choice) {
            case 1:
                Cli.greeting(sc);
                break;
            case 2:
                name = Cli.greeting(sc);
                game = new Even();
                gameEngine.startGame(sc, name, game);
                break;
            case 3:
                name = Cli.greeting(sc);
                game = new Calc();
                gameEngine.startGame(sc, name, game);
                break;
            case 4:
                name = Cli.greeting(sc);
                game = new GCD();
                gameEngine.startGame(sc, name, game);
                break;
            default:
                return;
        }
    }

    public static String greeting(Scanner sc) {
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        if (name.isBlank()) {
            name = "Default";
        }
        name = name.trim();
        System.out.println("Hello, " + name + "!");
        return  name;
    }

    public static void calc(Scanner sc) {
        Cli.greeting(sc);
        System.out.print("What is the result of the expression?");
    }
}
