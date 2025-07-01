package code.lab;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Enter your password: ");
        Scanner sc = new Scanner(System.in); // creates object that allows for inputs, listen for input
        String password = sc.nextLine(); // have to declare variable as a data type

        if (password.length() < 8) //needs to be in brackets, inside is the statement to be evaluated
        {
            System.out.println("Password " + password + " is too short");
            return; //exits the code
        }

        if (!doesPasswordContainALowerCaseLetter(password))//java uses camelcase: each new word is capitalised
        // ! means do not
        {
            System.out.println("Password " + password + " has  no lowercase letters");
            return;
        }
        if (!doesPasswordContainAnUpperCaseLetter(password))
        // ! means do not
        {
            System.out.println("Password " + password + " has  no uppercase letters");
            return;
        }

        if (!doesPasswordContainANumber(password))
        // ! means do not
        {
            System.out.println("Password " + password + " has  no numbers");
            return;
        }
        if (!doesPasswordContainASpecialCharacter(password))
        // ! means do not
        {
            System.out.println("Password " + password + " has  no special characters");
            return;
        }


        System.out.println("Your valid password is: " + password);
    }

    private static boolean doesPasswordContainASpecialCharacter(String password)
    {
        for (Character c: password.toCharArray()) //gets character and does a check on it, step through the list
        {
            if (!Character.isLetterOrDigit(c))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean doesPasswordContainANumber(String password)
    {
        for (int i = 0; i < password.length(); i++) //third part can be incremented (the i++ bit)
        {
            if (Character.isDigit(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean doesPasswordContainAnUpperCaseLetter(String password) {
        int count = 0;
        while (count < password.length())
        {
            return true;//checks for a digit within a for loop
        }
        count++;
        return false;
    }

    private static boolean doesPasswordContainALowerCaseLetter(String password)
    {
        int count = 0;
        do //always perform loop once, if condition is false it will stop
        {
            {
                if (Character.isLowerCase(password.charAt(count)))//query string
                //java has a character class, checks the case of input: is default
                {
                    return true;
                }
                count++;
            }

        }
        while (count < password.length() - 1);
        return false;
    }
}
