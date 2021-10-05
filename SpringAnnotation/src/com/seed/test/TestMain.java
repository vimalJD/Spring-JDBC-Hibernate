package com.seed.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.seed.beans.Employee;
import com.seed.beans.EmployeeConfig;

public class TestMain {

	public static void main(String[] args) {

		AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext(
				EmployeeConfig.class);

		Employee bean = (Employee) abstractApplicationContext
				.getBean("employeeBean");
		bean.setEmpid(111);
		bean.setEmpName("Vimal");
		System.out.println(bean);
		abstractApplicationContext.close();
	}
}
