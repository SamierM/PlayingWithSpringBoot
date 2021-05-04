package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyFileRandomFortuneService implements FortuneService {
	
	@Value("${fortune.fileName}")
	String fileName;
	
	private Random myRandom =  new Random();
	List<String> fortunes;

	@Override
	public String getFortune() {
		return fortunes.get(myRandom.nextInt(fortunes.size()));
	}
	
	@PostConstruct
	public void startupTasks() {
		File myFile = new File(fileName);
		try {
			Scanner fileScanner = new Scanner(myFile);
			fortunes = new ArrayList<String>();
			while(fileScanner.hasNextLine()) {
				String currFortune = fileScanner.nextLine();
				fortunes.add(currFortune);
			}
			
			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		
		
	}

}
