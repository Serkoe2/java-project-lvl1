package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n0 - Exit");
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
        }
        System.out.println("Your choice: " + Integer.toString(choice) + "\n");
        switch (choice) {
            case 0:
                return;
            case 1:
                Cli.greeting();
        }
    }
}
