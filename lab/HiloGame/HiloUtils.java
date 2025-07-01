package code.lab.HiloGame;

public class HiloUtils {

    public static int compare(int guess, int chosenNumber) {
        if (guess == chosenNumber) return 0;
        else if (guess < chosenNumber) return -1;
        else /*(guess > chosenNumber)*/ return 1;
    }
}
