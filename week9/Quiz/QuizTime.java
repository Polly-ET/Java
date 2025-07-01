package code.week9.Quiz;

import code.week9.Bank.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizTime
{
    public static void main(String[] args)
        {

            System.out.print("TRUE OR FALSE QUIZ");
            System.out.print("\nEnter t for true and f for false!");
            Quiz quiz = new Quiz();


            quiz.add(new Question("The star sign Aquarius is represented by a tiger","f"));
            System.out.print("\n");
            quiz.add(new Question("In the English language there is no word that rhymes with orange","t"));
            System.out.print("\n");
            quiz.add(new Question("The Battle Of Hastings took place in 1066","t"));
            System.out.print("\n");
            quiz.add(new Question("Titanic was released in 1999","f"));
            System.out.print("\n");
            quiz.add(new Question("Fish cannot blink","t"));

            // Start the quiz
            quiz.giveQuiz();

        }
}

