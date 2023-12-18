package com.dzrrcreations.designpatterns.CompositeDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dzrrcreations.designpatterns.CompositeDesignPattern.abstractclasses.SongComponent;
import com.dzrrcreations.designpatterns.CompositeDesignPattern.classes.DiscJockey;
import com.dzrrcreations.designpatterns.CompositeDesignPattern.classes.Song;
import com.dzrrcreations.designpatterns.CompositeDesignPattern.classes.SongGroup;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		compositeDesignPatternTeory();
		
		SongComponent industrialMusic = new SongGroup("Industrial", "Género de música que se baseia em sons e temas ásperos, mecânicos, transgressivos ou provocativos.");
		SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Género de música pesada originária do blues rock, do rock psicodélico e do acid rock.");
		SongComponent dubstepMusic = new SongGroup("Dubstep", "Género de música eletrónica com linhas de baixo muito fortes e padrões de bateria reverberantes, samples cortadas e vocais ocasionais");
		
		SongComponent everySong = new SongGroup("Song List", "Every Song Available");
		
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
		industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
		industrialMusic.add(dubstepMusic);
		
		dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
		dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));
		
		everySong.add(heavyMetalMusic);
		
		heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
		heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		crazyLarry.getSongList();
		
		
	}
	
	public static void compositeDesignPatternTeory() {
		StringBuilder sb = new StringBuilder();
		sb.append(drawHLine());
		sb.append("18 - Composite Design Pattern\n");
		sb.append(drawHLine());
		sb.append("What is the Composite Design Pattern?\n");
		sb.append("- Allows you to treat individual objects and compositions of objects uniformily\n");
		sb.append("- They allow you to represent part-whole hierarchies\n");
		sb.append("     - Components can be further divided into smaller components\n");
		sb.append("- You can structure data, or represent the inner working of every part of a whole object individually\n");
		sb.append(drawHLine());
		System.out.println(sb);
	}
	
	private static Object drawHLine() {
		return "-".repeat(120) + "\n";
	}

}
