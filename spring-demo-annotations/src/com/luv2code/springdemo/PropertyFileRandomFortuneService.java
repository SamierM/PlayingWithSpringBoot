package com.luv2code.springdemo;

import java.util.Random;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyFileRandomFortuneService implements FortuneService {
	
	
	@Value("${fortune.good}")
	private String goodFortune;
	
	
	@Value("${bad}")
	private String badFortune;
	
	private Random myRandom =  new Random();

	@Override
	public String getFortune() {
		String[] fortuneArray = {
				goodFortune,
				badFortune
		};
		
		return fortuneArray[myRandom.nextInt(fortuneArray.length)];
	}

}
