package code.week7.Player;

public abstract class PlayerStats extends Object
{
    private String name;
    private String win,lose,draw;

    PlayerStats(String name, String wins, String losses, String draws)
    {
        this.name = name;
        this.win = wins;
        this.lose = losses;
        this.draw = draws;
    }

    //passes, tackles

    public String getName ()
    {
        return name;
    }
    public String getWin()
    {
        return win;
    }

    public String getLose()
    {
        return lose;
    }

    public String getDraw()
    {
        return draw;
    }


    public String setname ()
    {
        return name;
    }
    public String setwins ()
    {
        return win;
    }
    public String setlosses ()
    {
        return lose;
    }
    public String setdraws ()
    {
        return draw;
    }




    public String toString()
    {
        return "" ;
    }



}
