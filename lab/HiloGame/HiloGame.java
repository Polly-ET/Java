package code.lab.HiloGame;

public class HiloGame {

    Player[] players;
    private int chosenNumber;
    Player winner;

    public HiloGame(int players) {
        this.players = new Player[players];
        String[] names = {"Harvey", "Jessica", "Mike", "Rachel"};
        for (int i = 0; i < players; i++) {
            this.players[i] = new Player(names[i]);
        }

    }
    public void setChosenNumber(int chosenNumber) {
        this.chosenNumber = (int) (Math.random()*chosenNumber)+1;
    }


    public void startGame() {
        boolean isPlaying = true;
        while (isPlaying) {
            for (Player player : players) {
                int guess = player.pickNumber(100);
                int status = HiloUtils.compare(guess, chosenNumber);

                if (status == 1) {
                    System.out.println("Guess too high - " + player + " next player to guess");
                }
                else if (status == -1) {
                    System.out.println("Guess too low - next player to guess");
                }
                else {
                    winner = player;
                    isPlaying = false;
                    break;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Winner is " + winner.toString() +
                " guessed " + chosenNumber;

    }
}