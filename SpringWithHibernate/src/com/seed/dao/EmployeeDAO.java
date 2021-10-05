package com.seed.dao;

import java.util.List;

import com.seed.beans.Employee;

public interface EmployeeDAO {

void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeById(int id);
	
	Employee findById(int id);
	
	void updateEmployee(Employee employee);
}
