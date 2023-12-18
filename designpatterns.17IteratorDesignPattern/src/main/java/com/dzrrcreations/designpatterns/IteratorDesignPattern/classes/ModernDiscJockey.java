package com.dzrrcreations.designpatterns.IteratorDesignPattern.classes;

import java.util.Iterator;

import com.dzrrcreations.designpatterns.IteratorDesignPattern.interfaces.SongIterator;

//How to do it:
public class ModernDiscJockey {

	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	public ModernDiscJockey(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs) {
		super();
		this.iter70sSongs = iter70sSongs;
		this.iter80sSongs = iter80sSongs;
		this.iter90sSongs = iter90sSongs;
	}

	public void showTheSongs() {
		
		Iterator<SongInfo> songs70s = this.iter70sSongs.createIterator();
		Iterator<SongInfo> songs80s = this.iter80sSongs.createIterator();
		Iterator<SongInfo> songs90s = this.iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s");
		printTheSongs(songs70s);
		
		System.out.println("\nSongs of the 80s");
		printTheSongs(songs80s);
		
		System.out.println("\nSongs of the 90s");
		printTheSongs(songs90s);
	}
	
	public void printTheSongs(Iterator<SongInfo> iterator) {
		iterator.forEachRemaining(i -> System.out.println(i.getSongName() + " " + i.getBandName() + " " + i.getYearReleased()));
	}

}
