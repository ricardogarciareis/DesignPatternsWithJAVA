package com.dzrrcreations.designpatterns.DesignPatterns01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.DesignPatterns01.model.WorkWithAnimals;

@SpringBootApplication
public class Application {
	


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		int randNum = 10;
		
		WorkWithAnimals wwa = new WorkWithAnimals();
		wwa.createDog("Fido", 30);
		
		
		System.out.println("RandNum afther method call: " + randNum);
		
		
		
	}

}
