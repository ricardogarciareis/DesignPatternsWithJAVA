package com.dzrrcreations.designpatterns.CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.DeviceButton;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.Radio;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.RadioRemote;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TVRemote;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.Television;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TurnDeviceOff;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TurnDeviceOn;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TurnDeviceVolumeDown;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TurnDeviceVolumeUp;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TurnItAllOff;
import com.dzrrcreations.designpatterns.CommandDesignPattern.classes.TurnItAllOn;
import com.dzrrcreations.designpatterns.CommandDesignPattern.interfaces.ElectronicDevice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		commandDesignPatternTeory();
		
		ElectronicDevice tvRemote = TVRemote.getDevice();
		
		//Commands
		TurnDeviceOn tvOnCommand = new TurnDeviceOn(tvRemote);
		TurnDeviceOff tvOffCommand = new TurnDeviceOff(tvRemote);
		TurnDeviceVolumeUp tvVolumeUpCommand = new TurnDeviceVolumeUp(tvRemote);
		TurnDeviceVolumeDown tvVolumeDownCommand = new TurnDeviceVolumeDown(tvRemote);
		
		//Receivers
		DeviceButton tvOnPressed = new DeviceButton(tvOnCommand);
		DeviceButton tvOffPressed = new DeviceButton(tvOffCommand);
		DeviceButton tvVolumeUpPressed = new DeviceButton(tvVolumeUpCommand);
		DeviceButton tvVolumeDownPressed = new DeviceButton(tvVolumeDownCommand);
		
		tvOnPressed.press();
		tvVolumeUpPressed.press();
		tvVolumeUpPressed.press();
		tvVolumeDownPressed.press();
		tvOffPressed.press();
		
		System.out.println(drawHLine());
		
		ElectronicDevice radioRemote = RadioRemote.getDevice();
		
		//Commands
		TurnDeviceOn radioOnCommand = new TurnDeviceOn(radioRemote);
		TurnDeviceOff radioOffCommand = new TurnDeviceOff(radioRemote);
		TurnDeviceVolumeUp radioVolumeUpCommand = new TurnDeviceVolumeUp(radioRemote);
		TurnDeviceVolumeDown radioVolumeDownCommand = new TurnDeviceVolumeDown(radioRemote);
		
		//Receivers
		DeviceButton radioOnPressed = new DeviceButton(radioOnCommand);
		DeviceButton radioOffPressed = new DeviceButton(radioOffCommand);
		DeviceButton radioVolumeUpPressed = new DeviceButton(radioVolumeUpCommand);
		DeviceButton radioVolumeDownPressed = new DeviceButton(radioVolumeDownCommand);
		
		radioOnPressed.press();
		radioVolumeUpPressed.press();
		radioVolumeUpPressed.press();
		radioVolumeDownPressed.press();
		radioOffPressed.press();
		
		System.out.println(drawHLine());
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		turnThemOff.press();
		
		System.out.println(drawHLine());
		
		TurnItAllOn turnOnDevices = new TurnItAllOn(allDevices);
		DeviceButton turnThemOn = new DeviceButton(turnOnDevices);
		turnThemOn.press();
		
		System.out.println(drawHLine());
		
		radioVolumeDownPressed.undo();
		radioVolumeDownPressed.undo();
		turnThemOn.undo();
		
		
	}
	
	public static void commandDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("12 - Command Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Command Design Pattern?\n");
		sb.append("- The command pattern is a behavioural design pattern in wich an object is used to represent and encapsulate all the \n");
		sb.append("  information needed to call a method at a later time.\n");
		sb.append("- This information includes the method name, the object that owns the method and values for the method parameters.\n");
		sb.append("- Allows you to store lists of code that is executed at a later time or many times.\n");
		sb.append("- Client says 'I want a specific Command to run when execute() is called on one of these encapsulated (hidden) Objects'.\n");
		sb.append("- An Object called the Invoker transfers this Command to another Object called a Receiver to execute the right code.\n");
		sb.append("- TurnTVOn - DeviceButton - TurnTVOn - Television.TurnTVOn()\n");
		sb.append(drawHLine());
		sb.append("Benefits of the Command Design Pattern?\n");
		sb.append("- Allows you to set aside a list of commands for later use;\n");
		sb.append("- A class is a great place to store procedures you want to be executed;\n");
		sb.append("- You can store multiple commands in a class to use over and over again;\n");
		sb.append("- You can implement undo procedures for past commands;\n");
		sb.append("- Negative: you create many small classes that store lists of commands.\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
