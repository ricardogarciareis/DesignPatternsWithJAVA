package com.dzrrcreations.designpatterns.BridgeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.BridgeDesignPattern.abstractclasses.RemoteButton;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.classes.DVDDevice;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.classes.DVDRemote;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.classes.TVDevice;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.classes.TVRemoteMute;
import com.dzrrcreations.designpatterns.BridgeDesignPattern.classes.TVRemotePause;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		bridgeDesignPatternTeory();
		
		RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 14));
		
		System.out.println("\nTest TV with Mute");
		theTV.buttonFivePressed();
		theTV.buttonSixPressed();
		theTV.buttonSixPressed();
		theTV.deviceFeedback();
		theTV.buttonNinePressed();
		
		System.out.println("\nTest TV with Pause");
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.deviceFeedback();
		theTV2.buttonNinePressed();
		
		System.out.println("\nTest DVD");
		theDVD.buttonFivePressed();
		theDVD.buttonSixPressed();
		theDVD.deviceFeedback();
		theDVD.buttonNinePressed();
		theDVD.volumeUp();
		theDVD.volumeUp();
		theDVD.volumeUp();
	}
	
	public static void bridgeDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("15 - Bridge Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Bridge Design Pattern?\n");
		sb.append("- Decouple an abstraction from its implementation so that the two can vary independently\n");
		sb.append("- The Bridge Pattern is very poorly explained\n");
		sb.append("- Everyone seems to explain it differently\n");
		sb.append("- Progessively adding functionality while separating out major differences using abstract classes\n");
		sb.append(drawHLine());
		sb.append("When to use the Bridge Design Pattern?\n");
		sb.append("- When you want to be able to change both the abstractions (abstract classes) and concrete classes independently\n");
		sb.append("- When you want to first abstract class to define rules (Abstract TV)\n");
		sb.append("- The concrete class adds additional rules (Concrete TV)\n");
		sb.append("- An abstract class has a reference to the device and it defines abstract methods that will be defined (Abstract Remote)\n");
		sb.append("- The Concrete Remote defines the abstract methods required\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
