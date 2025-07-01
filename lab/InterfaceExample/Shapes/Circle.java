package code.lab.InterfaceExample.Shapes;

import lab.shapes.Shape;

import java.awt.*;

public class Circle extends Shape //cannot instantiate shape
{
 // Circle needs to be defined

    private int radius;
    private int x,y;

    public Circle(int radius) //create shape type object
    {
        super(0);
        this.radius = radius;
    }

    @Override
    public int getArea() //now has a definition
    {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return "Circle with radius: " + radius + super.toString();
    }


    public void setColor(Color cyan) {

    }


    public void setLocation(Point point) {

    }


    public void paint(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.fillOval(x,y,2*radius,2*radius);
    }

}
