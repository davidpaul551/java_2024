package package_Q3.service;



import package_Q3.bean.Employee;

public class EmployeeServiceImp implements EmployeeService {

    public void getEmployeeDetails(Employee employee) {
        //employee details
        System.out.println(employee);
    }

    public String findInsuranceScheme(Employee employee) {
        // insurance scheme based on employee's salary and designation
        return employee.getInsuranceScheme();
    }
}