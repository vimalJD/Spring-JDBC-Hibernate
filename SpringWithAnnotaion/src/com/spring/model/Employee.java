package com.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int employeeId;
	private String name;
	
	public Employee()
	{
		System.out.println("From constructor");
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void initEmployee() {
		System.out.println("Init employee bean");
	}
	@PreDestroy
	public void destroyEmployee() {
		System.out.println("Employee not required");
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}
	
	
}
