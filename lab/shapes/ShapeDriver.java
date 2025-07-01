package lab.shapes;

import java.util.ArrayList;

public class ShapeDriver
{
    public static void main(String[] args)
    {
       // Shape shape = new Shape (2); //cannot instantiate shape

        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2,4);
        Ellipse ellipse = new Ellipse(2,4);

        //going to where area is defined

        //System.out.println(circle);
        //System.out.println(rectangle);
        //System.out.println(ellipse);

        ArrayList<Shape> shapes = new ArrayList<Shape>(); //collection of shape objects
        shapes.add(circle); //added shape object to collection
        shapes.add(rectangle);
        shapes.add(ellipse);


        //if we can instantiate shape it introduces errors: get output such as areas is 0 and then the number of sides
        //abstract forces interaction with @Override: forces a definition


        for (Shape shape : shapes)
        {
            System.out.println(shape);
        }

    }
}

