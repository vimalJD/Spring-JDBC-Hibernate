package com.seed.util;

import java.util.List;

import com.seed.beans.Employee;

public interface EmployeeDAO {

	public String getEmployeeName(int id);
	public int addEmployee(Employee emp);
	public int updateEmployee(Employee emp);
	public int deleteEmployee(Employee emp);
	public List<Employee> getAllEmployeee();
}
