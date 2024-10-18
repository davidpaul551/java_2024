package ExceptionHandlingLabbook;
import ExceptionHandlingLabbook.Invalidsalaryexception;

import java.util.Scanner;


class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) throws Invalidsalaryexception {
        this.id = id;
        this.name = name;
        setSalary(salary);  
        this.designation = designation;
        this.insuranceScheme = determineInsuranceScheme();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws Invalidsalaryexception {
        if (salary < 3000) {
            throw new Invalidsalaryexception("Salary must be greater than 3000.");
        }
        this.salary = salary;
        this.insuranceScheme = determineInsuranceScheme();
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    private String determineInsuranceScheme() {
        if (salary >= 50000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary >= 30000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 20000 && designation.equalsIgnoreCase("System Engineer")) {
            return "Scheme C";
        } else {
            return "No Scheme";
        }
    }

    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary +
                ", Designation=" + designation + ", InsuranceScheme=" + insuranceScheme + "]";
    }
}

public class ModifySalaryExceptionQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Enter Employee Designation: ");
            String designation = scanner.nextLine();

            Employee employee = new Employee(id, name, salary, designation);

            System.out.println(employee.toString());
            System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());

        } catch (Invalidsalaryexception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
