package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// trackCoach implementation for getDailyWorkOut method
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}

	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside the doMyStartupStuff");
	}
	
	//Add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside the doMyCleanupStuff");
	}
}
