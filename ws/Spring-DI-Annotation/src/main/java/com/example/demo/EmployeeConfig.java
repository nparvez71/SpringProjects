package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean
	public Employee employeeBean() {
		
	//	Employee employee = new Employee(1225312, "parvez", new Address("ut-10", "dkh", "bangla"));
		Employee employee = new Employee(1225312, "parvez", addressBean());
		return employee;
	}
	
	@Bean
	public Address addressBean() {
		
		Address address = new Address("ghulsan", "dhaka", "dhaka");
		return address;
		
	} 

}
