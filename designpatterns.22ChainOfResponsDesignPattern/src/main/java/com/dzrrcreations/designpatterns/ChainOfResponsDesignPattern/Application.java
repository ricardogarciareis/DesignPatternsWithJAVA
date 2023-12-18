package com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes.AddNumbers;
import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes.DivideNumbers;
import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes.MultiplyNumbers;
import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes.Numbers;
import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.classes.SubtractNumbers;
import com.dzrrcreations.designpatterns.ChainOfResponsDesignPattern.interfaces.Chain;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		chainOfResponsabilityDesignPatternTeory();
		
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubtractNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Numbers request1 = new Numbers(4, 2, "add");
		chainCalc1.calculate(request1);
		Numbers request2 = new Numbers(4, 2, "pow");
		chainCalc1.calculate(request2);
	}
	
	public static void chainOfResponsabilityDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("22 - Chain Of Responsability Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Chain Of Responsability Design Pattern?\n");
		sb.append("- This pattern send data to an object and if that object can't use it, it send it to any number of other objects that may be able to use it.\n");
		sb.append("     - Create 4 objects that can either add, subtract, multiply or divide.\n");
		sb.append("     - Send 2 numbers and a command an allow these 4 objects to decide which can handle the requested calculation.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
