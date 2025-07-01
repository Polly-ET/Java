package code.lab.InterfaceExample.Shapes;

import code.lab.InterfaceExample.Drawable;

import java.awt.*;

public abstract class Shape implements Drawable //abstract keyword, cannot instantiate shape
{
    private int sides;
    protected Color color;
    protected int x,y;

    Shape(int sides) //anything that inherits will always have sides
    {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    abstract public int getArea();

    @Override
    public String toString() //if we ever ask for output, this is what we will get
    {
        return " Area is: " + getArea() + "\nNumber of sides is: " + sides;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void setLocation(Point point)
    {
        this.x = point.x;
        this.y = point.y;
    }



}
