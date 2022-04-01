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

import com.capgemini.springboot.demo.model.AppUser;
import com.capgemini.springboot.demo.model.Department;
import com.capgemini.springboot.demo.model.Role;
import com.capgemini.springboot.demo.service.AppUserService;

@SpringBootTest
public class AppDepartmentServiceTests {

	Logger LOG = LoggerFactory.getLogger(this.getClass());

	private static Department dep;
	
	@Autowired
	private DepartmentService ds;

	@BeforeAll
	public static void setUp() {
		dep = new Department(2, "Manager", "Chennai");
	}

	@Test
	public void testGetDeptById() {
		LOG.info(dep.toString());
		Department expected = dep;
		Department actual = ds.getDeptById(dep.getDepartmentId());
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