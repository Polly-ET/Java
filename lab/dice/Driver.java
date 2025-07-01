package lab.dice;

public class Driver
{
    public static void main(String[] args)
    {
        System.out.println("Dice: Learning OOP example");

        //Dice dice1 = new Dice(); //instance of the object dice
        Dice dice2 = new Dice(20);//created two separate dices

       // dice1.current_number = 12;
        for(int i=0;i<50;i++)
        {
            //dice1.roll();//dice is calling method roll
            dice2.roll();

            //dice1.showHistory();
            dice2.showHistory();


        }

    }
}


//makes code more readable and understandable, with use of dice class