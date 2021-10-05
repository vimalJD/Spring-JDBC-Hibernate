package com.seed.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seed.beans.Employee;
import com.seed.dao.EmployeeDAO;

@Service("empService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO dao;

	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void updateEmployee(Employee employee) {
		dao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		dao.deleteEmployeeById(id);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
}
