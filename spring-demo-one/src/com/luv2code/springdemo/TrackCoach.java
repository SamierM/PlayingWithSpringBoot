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
	
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("\nTrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("\nTrackCoach: inside method doMyCleanupStuff");
	}
	
}
