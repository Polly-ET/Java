package code.week7.Player;

public class RugbyStats extends PlayerStats
{

    private String passes,tackles;

    RugbyStats(String name, String wins, String losses, String draws, String passes, String tackles)
    {
        super(name, wins, losses, draws);
        this.passes = passes;
        this.tackles = tackles;
    }


    public String toString()
    {
        return "\nRUGBY"+ "\nPlayer: " + getName() + "\nPasses: " + passes + "\nTackles: " + tackles + "\nWins: " + getWin()
                + "\nLoses: " + getLose() + "\nDraws: " + getDraw();
    }


}
