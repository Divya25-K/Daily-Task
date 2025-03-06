class Employee 
{
    private int id;
    private double salary;

    public Employee(int id, double salary) 
    {
        this.id = id;
        setSalary(salary); 
    }
    public double getSalary() 
    {
        return salary;
    }
    public int getId() 
    {
        return id;
    }
    public void setSalary(double salary) 
    {

        double minimumSalary = 3000.00;
        
        if (salary >= minimumSalary) 
        {
            this.salary = salary; 
        }
        else
        {
            System.out.println("Error: Salary cannot be less than " + minimumSalary);
        }
    }

    public void displayDetails() 
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
    
        Employee employee1 = new Employee(101, 4000.00);
        employee1.displayDetails();
        
        System.out.println();

        Employee employee2 = new Employee(102, 2500.00); 
        employee2.displayDetails(); 
    }
}
