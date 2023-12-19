package com.dzrrcreations.designpatterns.InterpreterDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeasurementConversion {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		String questionAsked = JOptionPane.showInputDialog(frame, "What is your Question?");
		ConversionContext question = new ConversionContext(questionAsked);
		String fromConversion = question.getFromConversion();
		String toConversion = question.getToConversion();
		double quantity = question.getQuantity();
		if(questionAsked != null) {
			try {
				Class tempClass = Class.forName(fromConversion);
				Constructor constructor = tempClass.getConstructor();
				Object convertFrom = (Expression) constructor.newInstance();
				Class[] methodParams = new Class[] { Double.TYPE };
				Method conversionMethod = tempClass.getMethod(toConversion, methodParams);
				Object[] params = new Object[] { new Double(quantity) };
				String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
				String answerToQuestion = question.getConversionResponse() + toQuantity + " " + toConversion;
				JOptionPane.showMessageDialog(null, answerToQuestion);
				
			} catch (NoSuchMethodException | SecurityException | InstantiationException | 
					IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		frame.dispose();
	}

}
