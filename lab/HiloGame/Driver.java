package code.lab.HiloGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        HiloGame game = new HiloGame(4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the maximum value for the guessing game: ");

        while (true) {
            try {
                int maxValue = scanner.nextInt();
                game.setChosenNumber(maxValue);
                break;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Invalid entry - Please enter the maximum value for the guessing game");
            }
        }

        game.startGame();

        System.out.println(game.toString());

    }
}
