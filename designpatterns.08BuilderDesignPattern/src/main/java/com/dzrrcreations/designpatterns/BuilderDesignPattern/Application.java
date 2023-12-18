package com.dzrrcreations.designpatterns.BuilderDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.BuilderDesignPattern.model.ModernRobotBuilder;
import com.dzrrcreations.designpatterns.BuilderDesignPattern.model.OldRobotBuilder;
import com.dzrrcreations.designpatterns.BuilderDesignPattern.model.Robot;
import com.dzrrcreations.designpatterns.BuilderDesignPattern.model.RobotBuilder;
import com.dzrrcreations.designpatterns.BuilderDesignPattern.model.RobotEnginner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		builderDesignPatternTeory();
		
		//Criar as especificações robot que pretendemos baseado nos modelos existentes
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		//Criar a fábrica que fabricará um robot baseado na especificações desejadas
		RobotEnginner robotEnginner = new RobotEnginner(oldStyleRobot);
		//Fabricar o robot
		robotEnginner.makeRobot();
		//Recolher o robot à porta da fábrica
		Robot firstRobot = robotEnginner.getRobot();
		//Conhecer o robot que comprámos
		System.out.println("Olá!!! Eu sou o teu robot estilo antigo:");
		System.out.println("Cabeça: " + firstRobot.getRobotHead());
		System.out.println("Tronco: " + firstRobot.getRobotTorso());
		System.out.println("Braços: " + firstRobot.getRobotArms());
		System.out.println("Pernas: " + firstRobot.getRobotLegs());
		
		
		RobotBuilder modernStyleRobot = new ModernRobotBuilder();
		robotEnginner = new RobotEnginner(modernStyleRobot);
		robotEnginner.makeRobot();
		Robot secondRobot = robotEnginner.getRobot();
		System.out.println("Olá!!! Eu sou o teu robot estilo moderno:");
		System.out.println("Cabeça: " + secondRobot.getRobotHead());
		System.out.println("Tronco: " + secondRobot.getRobotTorso());
		System.out.println("Braços: " + secondRobot.getRobotArms());
		System.out.println("Pernas: " + secondRobot.getRobotLegs());
		
	}
	
	public static void builderDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("08 - Builder Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Builder Pattern?\n");
		sb.append("- Pattern used to create objects made from a bunch of other objects:\n");
		sb.append("     - When you want to build an object made up from other objects\n");
		sb.append("     - When you want the creation of these parts to be independent of the main object\n");
		sb.append("     - Hide the creation of the parts from the client so both aren't dependent\n");
		sb.append("     - The builder knows the specifics and nobody else does\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
