package code.week9.Postcodes;

public class Postcodes
{

    private String postcode;
    private String firstName;
    private String lastName;

    public Postcodes(String firstName, String lastName, String postcode)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postcode = postcode;
    }

    public String toString()
    {
        return firstName + " " + lastName + " " + postcode;
    }
}