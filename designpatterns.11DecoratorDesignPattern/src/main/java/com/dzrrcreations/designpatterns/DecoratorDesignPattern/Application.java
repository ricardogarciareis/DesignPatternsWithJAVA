package com.dzrrcreations.designpatterns.DecoratorDesignPattern;

import java.text.DecimalFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.DecoratorDesignPattern.model.Mozzarella;
import com.dzrrcreations.designpatterns.DecoratorDesignPattern.model.Pizza;
import com.dzrrcreations.designpatterns.DecoratorDesignPattern.model.PlainPizza;
import com.dzrrcreations.designpatterns.DecoratorDesignPattern.model.TomatoSauce;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		decoratorDesignPatternTeory();
		
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		
		System.out.println("Ingredients: " + basicPizza.getDescription());
		DecimalFormat f = new DecimalFormat("##.00 €");
		System.out.println("Cost: " + f.format(basicPizza.getCost()).replace(".", ","));
		
	}
	
	public static void decoratorDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("11 - Decorator Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Decorator Design Pattern?\n");
		sb.append("- The Decorator allows you to modify an object dynamically\n");
		sb.append("- You would use it when you want the capabilities of inheritance with subclasses, but you need to add functionality at run time\n");
		sb.append("- It is more flexible than inheritance\n");
		sb.append("- Simplifies code because you add functionality using many simple classes\n");
		sb.append("- Rather than rewrite old code you can extend with new code\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
