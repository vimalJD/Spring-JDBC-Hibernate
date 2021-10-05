package com.seed.testmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.beans.Employee;


public class TestMain {
	
	public static void main(String[] args){
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
		
		System.out.println("HashCode : "+ employee.hashCode());
		
		Employee employee2 = (Employee) applicationContext.getBean("employee2");
		System.out.println(employee2);
		
		System.out.println("HashCode : "+ employee2.hashCode());
	
		/*Employee employee3 = (Employee) applicationContext.getBean("employee3");
		System.out.println(employee3);
		
		System.out.println("HashCode : "+ employee2.hashCode());*/
	}
}
