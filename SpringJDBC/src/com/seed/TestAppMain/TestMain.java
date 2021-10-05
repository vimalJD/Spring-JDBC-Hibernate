package com.seed.TestAppMain;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seed.beans.Employee;
import com.seed.util.EmployeeDAO;
import com.seed.util.SpringJDBCConfiguration;

public class TestMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext anApplicationContext = new AnnotationConfigApplicationContext(
				SpringJDBCConfiguration.class);

		EmployeeDAO empDao = anApplicationContext.getBean(EmployeeDAO.class);
		
		//get employee name by id
		String empName = empDao.getEmployeeName(400);
		
		System.out.println("Employee name is : " + empName);
		
		
		Employee e900 = new Employee();
		e900.setEmpId(900);
		e900.setEmpName("Siddhesh");
		e900.setEmpSalary(6000.0);
		
		//insert data by insert method
		int i = empDao.addEmployee(e900);
		System.out.println("number of records has been inserted : " + i);
		System.out.println(e900);

		Employee e231 = new Employee();
		e231.setEmpId(231);
		e231.setEmpSalary(20000.0);
		
		//update data by update method
		i = empDao.updateEmployee(e231);
		System.out.println("record is updated : " + i);

		Employee e3003 = new Employee();
		e3003.setEmpId(3003);
		
		//delete data by id
		i = empDao.deleteEmployee(e3003);
		System.out.println("No of rec deleted   are " + i);

		System.out.println("Here is the list of All employees");
		
		List<Employee> eList = empDao.getAllEmployeee();
		Iterator<Employee> iterator = eList.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

		anApplicationContext.close();
	}
}
