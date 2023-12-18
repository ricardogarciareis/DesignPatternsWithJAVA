package com.dzrrcreations.designpatterns.JavaReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.JavaReflection.model.EnemyShipFactory;
import com.dzrrcreations.designpatterns.JavaReflection.model.UFOEnemyShip;
import com.dzrrcreations.designpatterns.JavaReflection.test.Pessoa;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		JavaReflectionAPITeory();
		
		Class reflectClass = UFOEnemyShip.class;
		String className = reflectClass.getSimpleName();
		System.out.println("Class name: " + className);
		int classModifier = reflectClass.getModifiers();
		System.out.println("Class modifier is public: " + Modifier.isPublic(classModifier));
		// isAbstract, isFinal, isInterface, isPrivate, isProtected, isStatic, isStrict, isSynchonized, isVolatile
		System.out.println("Class modifier is abstract: " + Modifier.isAbstract(classModifier));
		System.out.println("Class modifier is interface: " + Modifier.isInterface(classModifier));
		Class classSuper = reflectClass.getSuperclass();
		System.out.println("Class super class: " + classSuper.getSimpleName());
		Method[] classMethods = reflectClass.getMethods();
		Stream<Method> streamMethods = Arrays.stream(classMethods);
		streamMethods.forEach(m -> {
			System.out.print("Class method name: " + m.getName());
			if(m.getName().startsWith("get"))
				System.out.print(" (is a Getter method)");
			else if(m.getName().startsWith("set"))
				System.out.print(" (is a Setter method)");
			System.out.print(" with a return type: " + m.getReturnType());
			Class[] parameterType = m.getParameterTypes();
			System.out.print(" | Parameter types: ");
			Stream<Class> streamParameterTypes = Arrays.stream(parameterType);
			streamParameterTypes.forEach(p -> System.out.print(p.getSimpleName() + " "));
			System.out.println(" ");
		});
		
		Constructor constructor = null;
		Object constructor2 = null;
		try {
			constructor = reflectClass.getConstructor(new Class[] {EnemyShipFactory.class});
			constructor2 = reflectClass.getConstructor(int.class, String.class).newInstance(12, "Random String");
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		Class[] constructParameters = constructor.getParameterTypes();
		System.out.print("Constructor Parameter types: ");
		Stream<Class> streamConstructParameters = Arrays.stream(constructParameters);
		streamConstructParameters.forEach(a -> System.out.print(a.getSimpleName() + " "));
		System.out.println();
		
		UFOEnemyShip newEnemyShip = null;
		EnemyShipFactory shipFactory = null;
		try {
			newEnemyShip = (UFOEnemyShip) constructor.newInstance(shipFactory);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		newEnemyShip.setName("XT-1000");
		System.out.println("New enemy ship name: " + newEnemyShip.getName());
		
		//Aceder e modificar propriedades e métodos privados
		Field privateStringName = null;
		UFOEnemyShip enemyshipPrivate = new UFOEnemyShip(shipFactory);
		try {
			//Aceder e Modificar propriedades privadas
			String idCodeString = "idCode";
			privateStringName = UFOEnemyShip.class.getDeclaredField(idCodeString);
			privateStringName.setAccessible(true);
			String valueOfName = (String) privateStringName.get(enemyshipPrivate);
			System.out.println("Valor da propriedade privada idCode: " + valueOfName);
			privateStringName.set(enemyshipPrivate, "101");
			valueOfName = (String) privateStringName.get(enemyshipPrivate);
			System.out.println("Valor da propriedade privada idCode modificado: " + valueOfName);
			
			//Aceder a métodos privados sem parâmetros
			String methodName = "getPrivate";
			Method privateMethod = UFOEnemyShip.class.getDeclaredMethod(methodName, null);
			privateMethod.setAccessible(true);
			String privateReturnVal = (String) privateMethod.invoke(enemyshipPrivate, null);
			System.out.println("EnemyShip Private method: " + privateReturnVal);
			
			//Aceder a métodos privados com parâmetros
			String methodName2 = "getOtherPrivate";
			Class[] methodParameters = new Class[] {Integer.TYPE, String.class};
			Object[] params = new Object[] {new Integer(10), new String("Hello")};
			Method privateMethod2 = UFOEnemyShip.class.getDeclaredMethod(methodName2, methodParameters);
			privateMethod2.setAccessible(true);
			String privateReturnVal2 = (String) privateMethod2.invoke(enemyshipPrivate, params);
			System.out.println("EnemyShip Private method 2: " + privateReturnVal2);
			
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
		
		
		Class reflectClassPessoa = Pessoa.class;
		Class[] interfacesPessoa = reflectClassPessoa.getInterfaces();
		Stream<Class> streamClasses = Arrays.stream(interfacesPessoa);
		streamClasses.forEach(c -> System.out.println("Pessoa Interface: " + c.getSimpleName()));
		
	}
	
	public static void JavaReflectionAPITeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("10 - JAVA Reflection API\n");
		sb.append(drawHLine());
		sb.append("What is the JAVA Reflection API?\n");
		sb.append("- Class Manipulator? YES\n");
		sb.append("- Used to manipulate classes and everything in a class\n");
		sb.append("- Can slow down a program because the JVM can't optimize the code\n");
		sb.append("- Can't be used with applets\n");
		sb.append("- Should be used sparingly\n");
		sb.append("What is the Greatest Thing bout JAVA Reflection API?\n");
		sb.append("- methodToExecute passed as a String\n");
		sb.append("- methodToExecute (int var1, String var2)\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "--------------------------------------------------------------------------------------------------------------------------\n";
	}

}
