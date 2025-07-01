package code.week9.Postcodes;

import java.util.ArrayList;
import java.util.Scanner;

public class PostcodeDriver
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Postcodes> addresses = new ArrayList<Postcodes>();


        System.out.println("Max 25 addresses, enter firstname, lastname and postcode separated by tabs! ");


        int count = 0;
        while (count < 25) {
            String line = scanner.nextLine();
            if (line.equals("quit")) {
                break;
            }


            String[] parts = line.split("\t");
            if (parts.length == 3) {
                String firstName = parts[0];
                String lastName = parts[1];
                String postalCode = parts[2];

                Postcodes person = new Postcodes(firstName, lastName, postalCode);
                addresses.add(person);  // adds to the list
                count++; //inc
            }
        }




        System.out.println("\nPOST CODES");
        for (Postcodes person : addresses)
        {
            System.out.println(person);
        }

        scanner.close();
    }
}