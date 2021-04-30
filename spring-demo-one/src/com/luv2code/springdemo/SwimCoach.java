package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach() {
		System.out.println("We are inside the no arg constructer of our SwimCoach");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SwimCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Swim across the atlantic";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
