package com.dzrrcreations.designpatterns.IteratorDesignPattern.classes;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import com.dzrrcreations.designpatterns.IteratorDesignPattern.interfaces.SongIterator;

//How not to do it (duplicate code):
public class DiscJockey {

	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;
	
	
	public DiscJockey(SongsOfThe70s songs70s, SongsOfThe80s songs80s, SongsOfThe90s songs90s) {
		super();
		this.songs70s = songs70s;
		this.songs80s = songs80s;
		this.songs90s = songs90s;
	}
	
	public void showTheSongs() {
		ArrayList<SongInfo> aL70sSongs = songs70s.getBestSongs();
		System.out.println("Songs of the 70s");
		for(int i=0; i < aL70sSongs.size(); i++) {
			SongInfo bestSong = (SongInfo) aL70sSongs.get(i);
			System.out.println(bestSong.getSongName() + " " + bestSong.getBandName() + " " + bestSong.getYearReleased());
		}
		
		SongInfo[] arrays80sSongs = songs80s.getBestSongs();
		System.out.println("\nSongs of the 80s");
		for(int i=0; i < arrays80sSongs.length; i++) {
			SongInfo bestSong = (SongInfo) arrays80sSongs[i];
			System.out.println(bestSong.getSongName() + " " + bestSong.getBandName() + " " + bestSong.getYearReleased());
		}
		
		Hashtable<Integer, SongInfo> hT90sSongs = songs90s.getBestSongs();
		System.out.println("\nSongs of the 90s");
		for(Enumeration<Integer> e = hT90sSongs.keys(); e.hasMoreElements(); ) {
			SongInfo bestSong = (SongInfo) hT90sSongs.get(e.nextElement());
			System.out.println(bestSong.getSongName() + " " + bestSong.getBandName() + " " + bestSong.getYearReleased());
		}
	}
	

}
