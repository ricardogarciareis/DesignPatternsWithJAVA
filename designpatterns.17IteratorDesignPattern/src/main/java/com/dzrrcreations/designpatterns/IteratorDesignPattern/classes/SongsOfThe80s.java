package com.dzrrcreations.designpatterns.IteratorDesignPattern.classes;

import java.util.Arrays;
import java.util.Iterator;

import com.dzrrcreations.designpatterns.IteratorDesignPattern.interfaces.SongIterator;

public class SongsOfThe80s implements SongIterator {

	SongInfo[] bestSongs;
	int arrayValue = 0;

	public SongsOfThe80s() {
		this.bestSongs = new SongInfo[3];
		addSong("Roam", "B52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears for Fears", 1985);
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		this.bestSongs[arrayValue] = songInfo;
		arrayValue++;
	}
	
	//How not to do it:
	public SongInfo[] getBestSongs() { return this.bestSongs; }

	@Override
	public Iterator<SongInfo> createIterator() {
		return Arrays.asList(this.bestSongs).iterator();
	}
}
