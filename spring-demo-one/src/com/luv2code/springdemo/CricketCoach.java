package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for email address and team 
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}

	//create a no-arg constructor. Spring will call this constructor when it
	//make reference to our bean
	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	// 1. Create setter method in the class for injection.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}	
	
	@Override
	public String getDailyWorkOut() {
	// implementation of getDailyWorkOut method 	
		return "Keep batting till you make a hundred and fast bowling for 15 minute";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
