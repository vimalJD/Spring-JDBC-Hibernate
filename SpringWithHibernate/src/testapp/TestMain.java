package testapp;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.seed.beans.Employee;
import com.seed.configuration.AppConfiguration;
import com.seed.util.EmployeeService;

public class TestMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		EmployeeService service = (EmployeeService) context.getBean("empService");
		/*
		 * Create Employee1
		 */
		Employee e2 = new Employee();
		e2.setEmpid(120);
		e2.setEmpName("Ravi");
		e2.setEmpRole("Clerk");
		
		Employee e1 = new Employee();
		e1.setEmpid(121);
		e1.setEmpName("Akshay");
		e1.setEmpRole("MD");
		
	    Employee e = new Employee();
	    e.setEmpid(130);
	    e.setEmpName("ajay");
		e.setEmpRole("Manager");
		e.setInsertTime(new Date());
		/*
		 * Persist both Employees
		 */
		service.saveEmployee(e1);
		service.saveEmployee(e2);
		service.saveEmployee(e);

		/*
		 * Get all employees list from database
		 */
		List<Employee> employees = service.findAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		/*
		 * delete an employee
		 */
		service.deleteEmployeeById(120);

		/*
		 * update an employee
		 */

		Employee employee = service.findById(130);
		employee.setEmpName("jay");
		service.updateEmployee(employee);

		/*
		 * Get all employees list from database
		 */
		List<Employee> employeeList = service.findAllEmployees();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}

		context.close();
	}
}
