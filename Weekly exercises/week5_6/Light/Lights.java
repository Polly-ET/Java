package code.week5_6.Light;

public class Lights
{
    public static void main(String[] args)
    {
        Bulb light1 = new Bulb();
        Bulb light2 = new Bulb();
        Bulb light3 = new Bulb();

        light1.setLightOn();
        light2.setLightOff();
        light3.setLightOn();

        System.out.println(light1);
        System.out.println(light2);
        System.out.println(light3);

    }
}
