package lab.shapes;

public abstract class Shape extends Object //abstract keyword, cannot instantiate shape
{
    private int sides;

    protected Shape(int sides) //anything that inherits will always have sides
    {
        this.sides = sides;
    }

    public int getSides()
    {
        return sides;
    }

    public void setSides(int sides)
    {
        this.sides = sides;
    }

    abstract public int getArea();

    @Override
    public String toString() //if we ever ask for output, this is what we will get
    {
        return " Area is: " + getArea() + "\nNumber of sides is: " + sides;
    }
}
