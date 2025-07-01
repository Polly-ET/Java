package code.week9.Bank;

//********************************************************************
//  Transactions.java       Java Foundations
//
//  Demonstrates the creation and use of multiple Account objects.
//********************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Transactions
{
    //-----------------------------------------------------------------
    //  Creates some bank accounts and requests various services.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {


        ArrayList<Account> customer = new ArrayList<>();


        System.out.println("Enter maximum 30 Customers, type quit to exit. ");
        System.out.println("To enter a new customer, include their name, account number and balance!");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (count < 30)
        {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("quit"))
            {  // stop if they type done
                break;
            }


            // tab key would split the input into three different parts
            String[] parts = line.split("\\s+");
            if (parts.length == 3)
            {
                String name = parts[0];
                long accNumber = Long.parseLong(parts[1]);
                double balance = Double.parseDouble(parts[2]);


                Account account = new Account(name,accNumber,balance);
                customer.add(account);
                count++;
            }
            else
            {
                System.out.println("Invalid input.");
            }
        }

        //account.addInterest();

        System.out.println("\nBANK ACCOUNTS");
        for (Account account : customer)
        {
            System.out.println(account);
        }

        scanner.close();
    }
}


