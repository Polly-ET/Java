package code.week7.Player;

public class CricketStats extends PlayerStats
{
    CricketStats(String name, String wins, String losses, String draws)
    {
        super(name, wins, losses, draws);
    }

    public String toString()
    {
        return "\nCRICKET"+ "\nPlayer: " + getName() + "\nWins: " + getWin()
                + "\nLoses: " + getLose() + "\nDraws: " + getDraw();
    }



}
