package code.week7.Player;

public class FootballStats extends PlayerStats
{

    private String goals_scored,passes,tackles;

    FootballStats(String name, String win, String lose, String draws, String goals_scored, String passes, String tackles)
    {
        super(name, win, lose, draws);
        this.goals_scored = goals_scored;
        this.passes = passes;
        this.tackles = tackles;
    }



    public String toString()
    {
        return "\nFOOTBALL"+ "\nPlayer: " + getName() + "\nGoals Scored: " + goals_scored + "\nPasses: " + passes + "\nTackles: " + tackles + "\nWins: " + getWin()
                + "\nLoses: " + getLose() + "\nDraws: " + getDraw();
    }



}
