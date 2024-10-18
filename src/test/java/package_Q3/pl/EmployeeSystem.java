package package_Q3.pl;

import package_Q3.bean.Employee;
import package_Q3.service.EmployeeService;
import package_Q3.service.EmployeeServiceImp;

import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImp();

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

        //employee details
        service.getEmployeeDetails(employee);

        //insurance scheme
        System.out.println("Insurance Scheme: " + service.findInsuranceScheme(employee));

        scanner.close();
    }
}