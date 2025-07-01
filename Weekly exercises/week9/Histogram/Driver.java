package code.week9.Histogram;

import java.util.Scanner;

public class Driver extends Dice
{
    public static void main (String[] args)
    {
        System.out.println("How many times would you like to roll: ");
        Scanner scanner = new Scanner(System.in);
        int rolls = scanner.nextInt();

        System.out.println("What step size should the histogram use: ");
        int steps = scanner.nextInt();

        Dice dice1 = new Dice(100);
        dice1.histogram(steps);
        scanner.close();
    }
}
