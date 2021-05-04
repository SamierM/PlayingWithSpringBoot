package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("propertyFileRandomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Spring is within the default constructor of TennisCoach");
	}
	
	//define init method
	@PostConstruct
	public void startupTasks() {
		System.out.println(">> TennisCoach: Inside of startup tasks");
	}
	
	
	//define destroy method
	@PreDestroy
	public void cleanupTasks() {
		System.out.println(">> TennisCoach: Inside of cleanup tasks");

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
