package code.week2;
import java.util.Scanner;
 //classes should be capitalised


// *******************************************************************
//   Average.java
//
//   Read three integers from the user and print their average
// *******************************************************************


public class FlexiAverage
{
    public static void main(String[] args)
    {
        int vals [] = new int[10];//square bracket is a collection of integers
        //int val1, val2, val3;//declared as integers
        double average;
        Scanner scan = new Scanner(System.in) ;


        // get three values from user
        System.out.println("Please enter ten integers and " + "I will compute their average!");

        for (int i = 0; i < 10; i++)
        {
            vals[i] = scan.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 10; i++)
        {
            total = total + vals[i];
        }
        average = (double)(total) / 3; //convert from float to double, both data types have to match

        System.out.println("The average is " + average);

    }
}