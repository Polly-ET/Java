package code.lab.square;

import lab.shapes.Cube;

import java.util.Scanner;

public class SquareDriver
{
    public static void main(String[] args)
    {
        System.out.println("==========");
        System.out.println("Squares");
        System.out.println("==========");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a side: ");

        int side = sc.nextInt();
        Cube cube = new Cube(side);

        System.out.println(cube.toString());
    }
}

