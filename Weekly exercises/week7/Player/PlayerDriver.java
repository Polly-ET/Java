package code.week7.Player;

public class PlayerDriver
{
    public static void main(String[] args)
    {
        FootballStats football = new FootballStats("Bob","10","5","2","50","70","30");
        RugbyStats rugby = new RugbyStats("Cam", "20","30","15","60", "43");
        CricketStats cricket = new CricketStats("Kevin", "40","20","10");



        System.out.println(football);
        System.out.println(rugby);
        System.out.println(cricket);



    }
}
