package code.week2;
import java.util.Scanner;

public class MilesToKilometers
{
    public static void main(String[] args)
    {
        float miles;
        System.out.println("Enter miles: ");
        Scanner sc = new Scanner(System.in);
        miles = sc.nextFloat();
        float kilometers = (float) (miles * 1.60935);
        System.out.println("Distance travelled in Kilometers: " + kilometers);
    }
}
