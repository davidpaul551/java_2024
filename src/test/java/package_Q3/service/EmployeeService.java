package package_Q3.service;


import package_Q3.bean.Employee;

public interface EmployeeService {
	String findInsuranceScheme(Employee employee);
	void getEmployeeDetails(Employee employee);
}
