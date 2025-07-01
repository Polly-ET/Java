package code.week4;
import java.util.Locale;
import java.util.Scanner;

// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
    public static void main (String[] args)
    {
        String college = new String ("Leeds Beckett University"); //Similar for part (a)


        String town = new String("Anytown,Uk"); // part (a)


        int stringLength;
        String change1, change2, change3;


        stringLength = college.length(); // part (b)


        System.out.println (college + " contains " + stringLength + " characters.");


        change1 = college.toUpperCase(); // part (c)
        System.out.println ("College in uppercase is: " + change1);

        change2 = college;// part (d)
        System.out.println(change2.replace('e', '*'));

        change3 = (town.concat(college)); // part (e)
        System.out.println ("The final string is " + change3);
    }
}