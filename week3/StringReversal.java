package code.week3;

import java.util.Scanner;


public class StringReversal
{
    public static void main(String[] args)
    {
        System.out.println("STRING REVERSAL PROGRAM");
        System.out.println("Enter a sentence to be reversed: ");
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();//strings are immutable
        String[] words = sentence.split(" ");//output will be an object of this type, gets a string array

        StringBuilder reversed_sentence = new StringBuilder();
        for (String word : words)
        {
            reversed_sentence.append((reverseWord(word)));
            reversed_sentence.append(" ");
        }
        reversed_sentence.deleteCharAt(reversed_sentence.length() - 1);
        System.out.println("Reversed sentence is: " + reversed_sentence.toString());
    }
    private static String reverseWord(String word)
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--)
        {
            reversed.append(word.charAt(i));//don't want to make an intense operation
        }
        return reversed.toString();
    }
}