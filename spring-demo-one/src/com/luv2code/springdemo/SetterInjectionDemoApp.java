package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemoApp {

	public static void main(String[] args) {

		//load Spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container
		SwimCoach theCoach = context.getBean("mySwimCoach", SwimCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		
		//close context
		context.close();

	}

}
