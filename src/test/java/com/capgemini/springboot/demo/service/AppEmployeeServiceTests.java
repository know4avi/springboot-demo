package com.capgemini.springboot.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.springboot.demo.model.Department;
import com.capgemini.springboot.demo.model.Employee;


@SpringBootTest
public class AppEmployeeServiceTests {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	private static Employee emp;
	
	@Autowired
	private EmployeeService es;

	@BeforeAll
	public static void setUp() {
		emp = new Employee(2, "Monu", 40000, new Department(2, "Manager", "Chennai"));
	}

	@Test
	public void testGetDeptById() {
		LOG.info(emp.toString());
		Employee expected = emp;
		Employee actual = es.getEmpById(emp.getEmployeeId());
		assertEquals(expected, actual);
	}

//	@Disabled
//	@Test
//	public void testLoginFailure() {
//		LOG.info(appUser.toString());
//		AppUser unexpected = appUser2;
//		AppUser actual = appUserService.loginUser(new AppUser("avi", "avi", Role.ADMIN));
//		assertNotEquals(unexpected, actual);
//	}
}