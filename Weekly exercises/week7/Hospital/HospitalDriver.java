package code.week7.Hospital;

public class HospitalDriver
{
    public static void main (String [] args)
    {
        Nurse nurse = new Nurse("1234","Cam");
        Doctor doctor = new Doctor("5678","Justin");
        Cleaner cleaner = new Cleaner("9101","Bob");

        System.out.println(nurse);
        System.out.println(doctor);
        System.out.println(cleaner);

    }
}
