package code.week4;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Sphere
{
    public static void main (String[] args)
    {

        float volume, area,radius;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = input.nextInt();

        DecimalFormat df_obj = new DecimalFormat("#.####");

        volume = (float) (((float)4/3) * Math.PI * (radius * radius *radius));
        System.out.println("Volume is " + df_obj.format(volume));

        area = (float) (4 * Math.PI * radius * radius)/3;
        System.out.println("Surface area is " + df_obj.format(area));

    }
}
