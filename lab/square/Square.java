package code.lab.square;

public class Square
{
    protected int side; //all can access this variable

    public Square(int side)
    {
        this.side=side;
    }


    //getters and setters gives more control, say what values are allowed
    public int getSide()  //getter
    {
        return side;
    }

    public void setSide(int side) //setter
    {
        this.side = side;
    }


    public int getArea()
    {
        return side * side;
    }

    public int getPerimeter()
    {
        return side * 4;
    }

    @Override //does not need to be stated, but it is best practice to do so
    public String toString()
    {
        return "Square has perimeter " + getPerimeter()
                + "Square has area " + getArea()
                + " and the side length of " + getSide();
    }
}
