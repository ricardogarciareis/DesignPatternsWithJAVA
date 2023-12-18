package com.dzrrcreations.designpatterns.IteratorDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.IteratorDesignPattern.classes.DiscJockey;
import com.dzrrcreations.designpatterns.IteratorDesignPattern.classes.ModernDiscJockey;
import com.dzrrcreations.designpatterns.IteratorDesignPattern.classes.SongsOfThe70s;
import com.dzrrcreations.designpatterns.IteratorDesignPattern.classes.SongsOfThe80s;
import com.dzrrcreations.designpatterns.IteratorDesignPattern.classes.SongsOfThe90s;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		iteratorDesignPatternTeory();
		
		SongsOfThe70s songs70s = new SongsOfThe70s();
		SongsOfThe80s songs80s = new SongsOfThe80s();
		SongsOfThe90s songs90s = new SongsOfThe90s();
		
		DiscJockey madMike = new DiscJockey(songs70s, songs80s, songs90s);
		//madMike.showTheSongs();
		
		ModernDiscJockey crazyMike = new ModernDiscJockey(songs70s, songs80s, songs90s);
		crazyMike.showTheSongs();
		
	}
	
	public static void iteratorDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("17 - Iterator Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Iterator Design Pattern?\n");
		sb.append("- The Iterator pattern provides you with a uniform way to access different collections of Objects\n");
		sb.append("- If you get an Array, ArrayList and Hashtable of Objects, you pop out an iterator for each and treat them the same\n");
		sb.append("- This provides a uniform way to cycle through different collections\n");
		sb.append("- You can also write polymorphic code because you can refer to each collection of objects because they'll implement\n");
		sb.append("  the same interface\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
