package code.week9.Histogram;

import java.util.ArrayList;

public class Dice implements Histogram //by default is extended
{
    private int current_number,sides;
    private ArrayList<Integer>  history = new ArrayList<>();
    //array list object


    public Dice()//refers to a constructor
    {
        this.sides = 6;//this refers to an instance (current one)
    }
    public Dice(int sides)
    {
        this.sides = sides;//can be passed a value
    }
    public void roll()//methods that belong to dice object
    {
        current_number = (int)(Math.random()*this.sides)+1;
        history.add(current_number); //add this to an array
    }
    public int getCurrent_number()//getter
    {
        return current_number;
    }
    public void showHistory()
    {
        int [] counter = new int[this.sides];
        for(int i = 0; i<this.history.size(); i++)
        {
            counter[history.get(i)-1]++;
        }
        for(int i = 0; i<this.sides; i++)
        {
            System.out.println("Number of " + (i+1) + " " + counter[i]);
        }
        //System.out.println(counter);
    }



    @Override
    public void histogram(int steps)
    {
        ArrayList<Integer> data = new ArrayList<>();
        for(int i = 0; i < 150; i++)
        {
            this.roll();
            data.add(this.current_number);
        }
        int columns = this.sides/steps;
        int start = 1;
        int end = start + (steps - 1);

        for (int i = start; i <= columns; i++){
            int length = data.size();
            int finalEnd = end;
            data.removeIf(n -> n <= finalEnd);
            int newlength = data.size();
            int items = length - newlength;
            String asterixes = "*".repeat(items);
            String str = "%d - %d |\t %s (%d) ".formatted(start, end, asterixes, items);
            System.out.println(str);
            start += steps;
            end += steps;
        }
        if (this.sides%steps != 0) {
            int length =data.size();
            int finalEnd = end;
            data.removeIf(n -> n <= finalEnd);
            int newlength = data.size();
            int items = length - newlength;
            String asterixes = "*".repeat(items);
            String str = "%d - %d |\t %s (%d) ".formatted(start, sides, asterixes, items);
            System.out.println(str);
        }
    }



}

//if something is private, can only be changed within the class it exists in
