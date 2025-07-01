package lab.shapes;

import code.lab.square.Square;

public class Cube extends Square
{
    public Cube (int side)
    {
        super(side);
    }

    public int getVolume()
    {
        return side*side*side;
    }

    @Override
    public String toString()
    {
        return "Cube has a volume of  " + getVolume() +
                "and has 6 squares. Each one has:"+ super.toString();
    }

}
