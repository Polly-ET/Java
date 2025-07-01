package code.week7.Hospital;

public class Doctor extends Employee
{
    private String patients;
    private String specialism;

    Doctor(String employeeNumber, String name)
    {
        super(employeeNumber, name);
    }

    public String setspecialism()
    {
        this.specialism = specialism;
        return specialism;
    }

    public String getSpecialism()
    {
        return "Pediatrician";
    }


    @Override
    public String getPatients()
    {
        this.patients = patients;
        patients = "60";
        return patients;
    }

    @Override
    public String getSalary()
    {
        return "41k";
    }


    public String toString()
    {
        return "\nDOCTOR" + "\nEmployee Number: " + getEmployeeNumber() + "\nName: " + getName() + "\nSalary: " + getSalary() +  "\nSpecialism: " + getSpecialism() + "\nPatients: " + getPatients();
    }

}
