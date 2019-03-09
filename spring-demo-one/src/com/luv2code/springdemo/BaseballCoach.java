package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//Define  a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency Injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		 //BaseballCoach implementation for getDailyWorkOut method
		return "spend 30 mins in batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
