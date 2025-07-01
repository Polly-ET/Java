package code.week3;
import java.util.Scanner;
import java.util.Random;

// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//
// ****************************************************************

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        String personPlay = " ";    //User's play -- "R", "P", or "S"
        String computerPlay = " ";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine computer's play


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        computerInt = generator.nextInt(3);

        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        //Translate computer's randomly generated play to string
        switch (computerInt)
        {
        case 0:
            computerPlay = "R";
            break;
        case 1:
            computerPlay = "S";
            break;
        case 2:
            computerPlay = "P";
            break;
        }

        System.out.println("Enter S for Scissors, R for Rock or P for Paper: ");
        personPlay = scan.nextLine();
        personPlay = personPlay.toUpperCase();

        System.out.println("Computer picked: " + computerPlay);
        // Winning combinations:
        // rock beats scissors
        // paper beats rock
        // scissors beat paper

        if (personPlay.equals("R"))
        {
            if (computerPlay.equals("R"))
            {
                System.out.println("It's a tie!");
                return;
            }
        }

        if (personPlay.equals("P"))
        {
            if (computerPlay.equals("P"))
            {
                System.out.println("It's a tie!");
                return;
            }
        }
        if (personPlay.equals("S"))
        {
            if (computerPlay.equals("S"))
            {
                System.out.println("It's a tie!");
                return;
            }
        }

        else if (personPlay.equals("R"))
        {
            if(computerPlay.equals("S"))
            {
                System.out.println("Rock beats Scissors, YOU WIN!");
                return;
            }
        }

        if (personPlay.equals("S"))
        {
            if (computerPlay.equals("P"))
            {
                System.out.println("Scissors beats Paper, YOU WIN!");
                return;
            }

        }

        else if (personPlay.equals("P"))
        {
            if (computerPlay.equals("R"))
            {
                System.out.println("Paper beats Rock, YOU WIN!");
                return;
            }

        }

//losing combinations
        if (computerPlay.equals("R"))
    {
        if (personPlay.equals("S"))
        {
            System.out.println("Rock beats Scissors, YOU LOSE!");
            return;
        }
    }
        if (computerPlay.equals("P"))
        {
            if (personPlay.equals("R"))
            {
                System.out.println("Paper beats Rock, YOU LOSE!");
                return;
            }
        }
        if (computerPlay.equals("S"))
        {
            if (personPlay.equals("P"))
            {
                System.out.println("Scissors beats Paper, YOU LOSE!");
                return;
            }
        }
    }
}