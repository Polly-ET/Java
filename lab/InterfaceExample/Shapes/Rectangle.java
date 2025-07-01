package code.lab.InterfaceExample.Shapes;

import java.awt.*;

public class Rectangle extends Shape
{

    protected int width;
    protected int height;

    public Rectangle (int width, int height)
    {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }

    @Override
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height + super.toString();
    }

    @Override
    public void paint(Graphics g) {

    }
}
