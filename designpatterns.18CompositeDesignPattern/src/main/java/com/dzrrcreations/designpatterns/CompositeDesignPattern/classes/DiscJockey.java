package com.dzrrcreations.designpatterns.CompositeDesignPattern.classes;

import com.dzrrcreations.designpatterns.CompositeDesignPattern.abstractclasses.SongComponent;

public class DiscJockey {

	private SongComponent songList;

	public DiscJockey(SongComponent songList) {
		super();
		this.songList = songList;
	}
	
	public void getSongList() {
		this.songList.displaySongInfo();
	}
}
