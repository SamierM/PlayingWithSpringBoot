package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] possibleFortunes = {
			"Good Luck Forever",
			"Bad Luck For Eternity",
			"Try Again"
	};
	
	private Random random = new Random();

	
	public String getDailyFortune() {
		return possibleFortunes[random.nextInt(3)];
	}

}
