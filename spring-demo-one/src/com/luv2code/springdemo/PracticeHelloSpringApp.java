package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
		// 1. Load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Retrieve bean from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		
		// 3. Call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());
		
		// 4. Close the context
		context.close();

	}

}
