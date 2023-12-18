package com.dzrrcreations.designpatterns.IteratorDesignPattern.classes;

import java.util.ArrayList;
import java.util.Iterator;

import com.dzrrcreations.designpatterns.IteratorDesignPattern.interfaces.SongIterator;


public class SongsOfThe70s implements SongIterator {
	
	ArrayList<SongInfo> bestSongs;

	public SongsOfThe70s() {
		this.bestSongs = new ArrayList<SongInfo>();
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I Will Survive", "Gloria Gaynor", 1979);
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		this.bestSongs.add(songInfo);
	}
	
	//How not to do it:
	public ArrayList<SongInfo> getBestSongs() { return this.bestSongs; }

	@Override
	public Iterator<SongInfo> createIterator() {
		return this.bestSongs.iterator();
	}

}
