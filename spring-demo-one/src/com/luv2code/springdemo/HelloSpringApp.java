// Spring Injection and Spring Inversion of Control

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// 1. Load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Retrieve bean from spring container
		//Below myCoach = bean id; Coach = Interface
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// 3. Call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// Lets call our new fortune method here from myCoach Bean
		System.out.println(theCoach.getDailyFortune());
		
		// 4. Close the context
		context.close();
	}

}
