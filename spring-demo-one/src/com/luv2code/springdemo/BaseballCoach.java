package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}


	public String getDailyWorkout() {
		return "Practice hitting a ball today";
	}


	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}


}
