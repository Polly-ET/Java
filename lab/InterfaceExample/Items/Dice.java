package code.lab.InterfaceExample.Items;

import code.lab.InterfaceExample.Drawable;

import java.awt.*;
import java.util.ArrayList;

public class Dice implements Drawable //by default is extended
{
    private int current_number,sides;
    private int x,y;
    private Color color;
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
     public String toString()
     {
         return "Dice: Current number: " + current_number;
     }

    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(x,y,50,50);
        g.setColor(Color.YELLOW);
        String str = Integer.toString(this.current_number);
        g.drawString(str,x+15,y+15);
    }

    @Override
    public void setColor(Color color)
    {

    }

    @Override
    public void setLocation(Point point)
    {
        this.x = point.x;
        this.y = point.y;
    }
}

//if something is private, can only be changed within the class it exists in
