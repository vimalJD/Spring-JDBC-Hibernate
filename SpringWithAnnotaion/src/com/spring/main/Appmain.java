package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	        Employee bean = (Employee) context.getBean("employeeBean");
	        bean.setEmployeeId(444);
	        bean.setName("vimal");
	        System.out.println(bean);
	        context.close();*/
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("Spring.xml");
		Employee e = (Employee) appContext.getBean(Employee.class);
		System.out.println(e);
		appContext.close();
		
	}

}
