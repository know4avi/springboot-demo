package com.capgemini.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(App.class, args);
		LOG.info("End");
	}

}

//package com.capgemini.springboot.demo;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringbootDemoApplication {
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		SpringApplication.run(SpringbootDemoApplication.class, args);
//		System.out.println("end");
//	}
//
//}
