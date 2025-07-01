package code.week4;
import java.util.Scanner;
import java.util.Random;

public class PinEncrypt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 digit pin: ");
        int pin = sc.nextInt();

        String hex = Integer.toHexString(pin);
        //System.out.println("Hex: " + str);

        Random generator = new Random();
        int gen1 = generator.nextInt(1000,65535);
        int gen2 = generator.nextInt(1000,65535);

        String num1 = Integer.toHexString(gen1);
        String num2 = Integer.toHexString(gen2);

        System.out.println("Pin encrypted is: " + num1 + hex + num2);

    }
}
