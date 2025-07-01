package code.week7.Hospital;

public class Cleaner extends Employee
{
    private String department;
    private String task;

    Cleaner(String employeeNumber, String name)
    {
        super(employeeNumber, name);
    }

    public String setdepartment()
    {
        this.department = department;
        return department;
    }


    public String settask()
    {
        this.task = task;
        return task;
    }

    public String getTask()
    {
        return "Sweeping";
    }

    public String getDepartment()
    {
        return "Housekeeper";
    }

    @Override
    public String getSalary()
    {
        return "23k";
    }

    @Override
    public String getPatients()
    {
        return "";
    }

    public String toString()
    {
        return "\nCLEANER" + "\nEmployee Number: " + getEmployeeNumber() + "\nName: " + getName() + "\nSalary: " + getSalary() + "\nDepartment: " + getDepartment() + "\nTask: " + getTask();
    }



}
