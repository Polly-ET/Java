package code.week5_6.Light;

public class Bulb
{

//Design and implement a class called Bulb that represents a light bulb that can be turned on and off.
//Create a driver class called Lights, whose main method instantiates and turns on some Bulb objects

    private String status;

    public Bulb  ()
    {
        this.status = "ON";
        this.status = "OFF";
    }

    public String setLightOn()
    {
        this.status = "ON";
        return status;
    }

    public String setLightOff()
    {
        this.status = "OFF";
        return status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override //does not need to be stated, but it is best practice to do so
    public String toString()
    {
        return "Light is: " + status ;
    }

}
