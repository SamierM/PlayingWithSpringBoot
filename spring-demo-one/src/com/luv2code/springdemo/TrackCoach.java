package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		return "Run a marathon today";
	}


	public String getDailyFortune() {
		return "Just do it " + fortuneService.getDailyFortune();
		}
}
