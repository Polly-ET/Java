package lab.shapes;

import java.awt.Shape;

public class Rectangle extends Shape
{

    private int width;
    private int height;

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
}
