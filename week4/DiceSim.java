package code.week4;

import java.util.Random;
import java.util.Scanner;


public class DiceSim
{
    public static void main (String[] args)
    {
        int dice1, dice2, sum = 0, sum2 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("How many sides does dice 1 have? ");
        int dice1Sides = input.nextInt();
        System.out.println("How many sides does dice 2 have? ");
        int dice2Sides = input.nextInt();

        Random generator = new Random();

        float average = 0;
        float average2 = 0;
        for (int i = 0; i < 3; i++) {
            int roll = generator.nextInt(1, dice1Sides);
            int roll2 = generator.nextInt(1, dice2Sides);


            sum += roll;
            sum2 += roll2;

            System.out.println("Roll " + (i + 1) + ": Dice 1 rolled = " + roll + ", Dice 2 rolled = " + roll2);


            average = sum / 3;
            average2 = sum2 / 3;


        }
        System.out.println("The sum of dice 1 is: " + sum + " and the average of dice 1 is: " + average);
        System.out.println("The sum of dice 2 is: " + sum2 + " and the average of dice 2 is: " + average2);
    }
}
