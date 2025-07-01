package code.week2;

import java.util.Scanner;

public class Square
{
    public static void main(String[] args)
    {
        float length, width;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        length = sc.nextFloat();
        System.out.print("Enter the width of the square: ");
        width = sc.nextFloat();

        float area = length * width;
        System.out.print("Area of the square =  " + area);
        System.out.print("\n");
        float perimeter = length * 2 + width * 2;
        System.out.println("Perimeter of the square =  " + perimeter);


    }
}
