package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Spring is within the default constructor of TennisCoach");
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}


	@Override 
	public String getDailyWorkout() {
		return "Practice your backhand";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
