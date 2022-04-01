package cg.feb18.spring.demo.config;

import org.springframework.context.annotation.Bean;

import cg.feb18.spring.demo.model.Employee;

public class SpringConfig {

	@Bean
	public Employee getEmployee() {
//		return new Employee();
		return new Employee(103, "Tonu", 60000);
	}

}