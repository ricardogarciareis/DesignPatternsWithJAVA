package com.dzrrcreations.designpatterns.DesignPatterns02;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.DesignPatterns02.model.Animal;
import com.dzrrcreations.designpatterns.DesignPatterns02.model.Cat;
import com.dzrrcreations.designpatterns.DesignPatterns02.model.Dog;
import com.dzrrcreations.designpatterns.DesignPatterns02.model.Giraffe;


@SpringBootApplication
public class Application {
	
	int justANum = 10;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		//WorkWithAnimals wwa = new WorkWithAnimals();
		//wwa.createDog("Fido", 30);
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says: " + kitty.getSound());
		
		//Array
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		//List
		List<Animal> animalsList = new ArrayList<Animal>();
		animalsList.add(doggy);
		animalsList.add(kitty);
		
		//Vector
		Vector<Animal> animalsVector = new Vector<Animal>();
		animalsVector.add(doggy);
		animalsVector.add(kitty);
		
		//Hashtable
		Hashtable<Integer, Animal> animalsHashtable = new Hashtable<Integer, Animal>();
		animalsHashtable.put(1, doggy);
		animalsHashtable.put(2, kitty);
		
		//Set Name
		String dogName = "Fido";
		animals[0].setName(dogName);
		animalsList.get(0).setName(dogName);
		animalsVector.get(0).setName(dogName);
		animalsHashtable.get(1).setName(dogName);
		
		String catName = "Dido";
		animals[1].setName(dogName);
		animalsList.get(1).setName(dogName);
		animalsVector.get(1).setName(dogName);
		animalsHashtable.get(2).setName(catName);
		
		//Get Name
		System.out.println(animals[0].getName());
		System.out.println(animalsList.get(0).getName());
        System.out.println(animalsVector.get(0).getName());
        System.out.println(animalsHashtable.get(1).getName());
        
        System.out.println(animals[1].getName());
		System.out.println(animalsList.get(1).getName());
        System.out.println(animalsVector.get(1).getName());
        System.out.println(animalsHashtable.get(2).getName());
        
        speakAnimal(kitty);
        
        System.out.println(doggy.getName() + " " + ((Dog)doggy).digHole());
        
        //Just type "sysout" in your Java editor and press Ctrl + space, which triggers code completion.
        //Does not work:
        //System.out.println(justANum);
        //sayHello();
        //((Dog)doggy).bePrivate();
        
        //It works:
        ((Dog)doggy).accessPrivate();
        
        
        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        System.out.println("Giraffe name: " + giraffe.getName());
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println(randAnimal.getName() + " says " + randAnimal.getSound());
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

}
