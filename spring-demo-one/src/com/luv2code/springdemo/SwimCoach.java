package com.luv2code.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public SwimCoach() {
		System.out.println("We are inside the no arg constructer of our SwimCoach");
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {

		System.out.println("SwimCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {

		System.out.println("SwimCoach: inside setter method - setTeam");
		this.team = team;
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
