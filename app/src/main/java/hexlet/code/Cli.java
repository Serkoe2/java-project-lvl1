package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void Greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.next();
        if (name.isBlank()) {
            name = "Default";
        }
        name = name.trim();
        System.out.println("Hello, " + name + "!");
    }
}
