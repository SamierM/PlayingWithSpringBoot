package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component()
public class PracticeCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "A practice a day keeps the losses at bay";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
