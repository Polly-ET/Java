package code.week5_6.Sphere;

public class MultiSphere
{
    public static void main(String[] args)
    {

        Sphere sphere1 = new Sphere(10);
        Sphere sphere2 = new Sphere(20);
        Sphere sphere3 = new Sphere(30);

        sphere1.setdiameter(25);
        sphere2.setdiameter(50);
        sphere3.setdiameter(75);

        System.out.println (sphere1);
        System.out.println (sphere2);
        System.out.println (sphere3);
    }
}
