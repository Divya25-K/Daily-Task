// STATIC AND NON-STATIC

class Company 
{
    static String company_name = "India Land";

    String employee_name;

    Company(String employee_name) 
    {
        this.employee_name = employee_name;
    }

    void displayDetails() 
    {
        System.out.println("Company Name: " + company_name);
        System.out.println("Employee Name: " + employee_name);
    }
}


public class Main 
{
    public static void main(String[] args)
    {
        Company employee1 = new Company("Madhu");
        Company employee2 = new Company("Divya");
        Company employee3 = new Company("Jeeva");
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();
        System.out.println();

        System.out.println("Employee 2 Details:");
        employee2.displayDetails();
        System.out.println();

        System.out.println("Employee 3 Details:");
        employee3.displayDetails();
    }
}
