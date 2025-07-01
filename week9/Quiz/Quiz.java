package code.week9.Quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz
{

    private ArrayList<Question> questions;

    public Quiz()
    {
        questions = new ArrayList<Question>();
    }

    public void add(Question question)
    {
        if (questions.size() < 5)
        {
            questions.add(question);
        } else {
            System.out.println("Maximum questions added");
        }
    }

    public void giveQuiz()
    {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.size(); i++)
        {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equals(q.getCorrectAnswer()))
            {
                System.out.println("Correct!\n");
                score++;
            } else
            {
                System.out.println("Wrong! Correct answer: " + q.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("You got " + score + " correct!");
    }

}
