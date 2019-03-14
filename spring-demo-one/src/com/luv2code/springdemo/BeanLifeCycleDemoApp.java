package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	
		// 1. Load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// 2. Retrieve bean/s from the container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(theCoach.getDailyWorkOut());
		
		//close the context
		context.close();
		
	}

}
