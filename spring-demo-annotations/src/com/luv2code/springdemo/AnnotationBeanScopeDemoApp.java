package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		
		System.out.println("\nThey are pointing to the same object: " + (theCoach == alphaCoach));
		System.out.println("\nMemory Location for theCoach " + theCoach);
		System.out.println("\nMemory Location for alphaCoach " + alphaCoach);



		
		//close context
		context.close();

	}

}
