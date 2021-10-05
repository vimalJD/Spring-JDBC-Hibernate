package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.configuration.AppConfig;
import com.spring.model.Application;
import com.spring.model.Bond;
import com.spring.model.Driver;
import com.spring.model.Employee;
import com.spring.model.Performer;

public class AppMain {
	public static void main(String a[])
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// Byname Autowiring
		Application application = (Application) context.getBean("application");
		System.out.println("Application Details : " + application);

		// ByType Autowiring
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Employee Details : " + employee);

		// By Constructor Autowiring
		Performer performer = (Performer) context.getBean("performer");
		System.out.println("Performer Details : " + performer);

		// Setter Autowiring
		Driver driver = (Driver) context.getBean("driver");
		System.out.println("Driver Details : " + driver);

		Bond bond = (Bond) context.getBean("bond");
		bond.showCar();
	}
}
