package com.seed.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.seed.beans")
public class EmployeeConfig {

	@Bean(name = "employeeBean")

	@Description("This is a simple bean")
	public Employee employeeConfig() {
		return new Employee();
	}

}
