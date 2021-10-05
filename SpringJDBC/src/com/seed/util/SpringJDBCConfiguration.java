package com.seed.util;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBCConfiguration {

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:oracle12c102");
		dataSource.setUsername("system");
		dataSource.setPassword("**********");
		return dataSource;

	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;

	}
	
	@Bean
	public EmployeeDAO employeeDAO(){
		
		EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
		employeeDAOImpl.setJdbcTemplate(jdbcTemplate());
		
		return employeeDAOImpl;
		
	}
}
