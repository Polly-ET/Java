package code.week5_6.Bank;

//********************************************************************
//  Transactions.java       Java Foundations
//
//  Demonstrates the creation and use of multiple Account objects.
//********************************************************************

public class Transactions
{
    //-----------------------------------------------------------------
    //  Creates some bank accounts and requests various services.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        Account acct1 = new Account ("Ted Murphy", 72354, 25.59);
        Account acct2 = new Account ("Angelica Adams", 69713, 500.00);
        Account acct3 = new Account ("Edward Demsey", 93757, 769.32);

        acct1.deposit (44.10);  // return value ignored

        double adamsBalance = acct2.deposit (75.25);
        System.out.println ("Adams balance after deposit: " +
                adamsBalance);

        System.out.println ("Adams balance after withdrawal: " +
                acct2.withdraw (480, 1.50));

        acct3.withdraw (-100.00, 1.50);  // invalid transaction


        Account addedaccount = new Account("Bob",45677);


        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println (addedaccount);
        System.out.println (acct1);
        System.out.println (acct2);
        System.out.println (acct3);
    }
}
//account to be opened with just a name and an account number,
// assuming an initial balance of zero.
// Modify the main method of the Transactions class to demonstrate this new capability