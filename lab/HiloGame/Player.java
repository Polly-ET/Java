package code.lab.HiloGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int pickNumber(int maxValue) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and " + maxValue + ": ");

        while (true) {
            try {
                int choice = sc.nextInt();
                //sc.close();
                return choice;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Invalid entry");
            }

        }
    }

    @Override
    public String toString() {
        return name;
    }
}
