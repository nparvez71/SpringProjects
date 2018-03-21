package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	public Employee emp() {
		Employee employee=new Employee();
		employee.setId(1001);
		employee.setName("janaat");
		employee.setCity("gazi");
		return employee;
	}

}
