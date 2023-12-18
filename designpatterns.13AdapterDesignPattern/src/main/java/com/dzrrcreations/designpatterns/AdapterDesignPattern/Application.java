package com.dzrrcreations.designpatterns.AdapterDesignPattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.AdapterDesignPattern.classes.EnemyRobot;
import com.dzrrcreations.designpatterns.AdapterDesignPattern.classes.EnemyRobotAdapter;
import com.dzrrcreations.designpatterns.AdapterDesignPattern.classes.EnemyTank;
import com.dzrrcreations.designpatterns.AdapterDesignPattern.interfaces.EnemyAttacker;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		adapterDesignPatternTeory();
		
		EnemyTank rx7Tank = new EnemyTank();
		EnemyRobot fredTheRobot = new EnemyRobot();
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.print(StringUtils.rightPad("-- The Robot ", 50, "-") + "\n");
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walksForward();
		fredTheRobot.smashWithHands();
		
		System.out.print(StringUtils.rightPad("-- The Enemy Tank ", 50, "-") + "\n");
		rx7Tank.assignDriver("John");
		rx7Tank.driveForward();
		rx7Tank.fireWeapon();
		
		System.out.print(StringUtils.rightPad("-- The Robot with Adapter ", 50, "-") + "\n");
		robotAdapter.assignDriver("Frank");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}
	
	public static void adapterDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("13 - Adapter Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Adapter Design Pattern?\n");
		sb.append("- Allows two incompatible interfaces to work together.\n");
		sb.append("- Used when the client expects a (target) interface.\n");
		sb.append("- The Adapter class allows the use of the available interface and the Target interface.\n");
		sb.append("- Any class can work together as long as the Adapter solves the issue that all classes must implement every method\n");
		sb.append("  defined by the shared interface\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
