package lab.shapes;

import java.awt.*;

public class Circle extends Shape //cannot instantiate shape
{
 // Circle needs to be defined

    private int radius;

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

}
