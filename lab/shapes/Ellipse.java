package lab.shapes;

public class Ellipse extends Rectangle //Ellipse is a type of shape
{
    public Ellipse(int width, int height) {
        super(width, height);
    }

    @Override
    public int getArea()
    {
        return (int)(Math.PI *(super.getArea()/4));
    }

    @Override
    public String toString()
    {
        return "Ellipse based on: " + super.toString();
    }

}
