package code.week2;
import java.util.Scanner;

public class Fractions
{
    public static void main(String[] args)

    {
    int numerator, denominator;
    float calculate;

    System.out.println("Enter numerator: ");
    Scanner sc = new Scanner(System.in);
    numerator = sc.nextInt();
    System.out.println("Enter denominator: ");
    denominator = sc.nextInt();

    calculate = ((float) numerator / denominator);
    System.out.println("The fraction as a decimal is: " + calculate);
    }
}
