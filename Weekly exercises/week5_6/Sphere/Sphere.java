package code.week5_6.Sphere;

//********************************************************************
//Design and implement a class called Sphere that contains instance data that represent a sphere’s diameter.
//        -   Define a Sphere constructor to accept and initialize the diameter.
//        -   Include getter and setter methods for the diameter.
//        -   Include methods to calculate and return the volume and surface area of the sphere.
//        -   Include a toString method that returns a one-line description of the sphere.
//        -   Create a driver class (main class) called MultiSphere, whose main method instantiates and updates several Sphere objects.
//********************************************************************
import java.lang.Math;

public class Sphere
{

    private float radius;
    private float diameter ;

    public Sphere (float diameter)
    {
        this.diameter = diameter;
    }

    public float getdiameter()
    {
        return diameter;
    }

    public void setdiameter(float diameter) //setter
    {
        this.diameter = diameter;
    }


    public float getArea()
    {
        float radius = diameter/2;
        return (float) (4 * Math.PI * radius * radius)/3;
    }

    public float getVolume()
    {
        float radius = diameter/2;
        return (float) (((float)4/3) * Math.PI * (radius * radius *radius));
    }
    @Override //does not need to be stated, but it is best practice to do so
    public String toString()
    {
        return "Sphere has surface area of " + getArea()
                + " and sphere has volume " + getVolume();
    }
}

