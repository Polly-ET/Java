package code.week7.Hospital;

public class Nurse extends Employee
{
    private String patients;

    Nurse(String employeeNumber, String name)
    {
        super(employeeNumber, name);
    }

    public String getPatients()
    {
        this.patients = patients;
        patients = "45";
        return patients;
    }

    @Override
    public String getSalary()
    {
        return "37k";
    }


    @Override
    public String toString()
    {
        return "\nNURSE " + "\nEmployee Number: " + getEmployeeNumber() + "\nName: " + getName() + "\nSalary: " + getSalary() + "\nPatients: " + getPatients();
    }
}
