package com.dzrrcreations.designpatterns.IteratorDesignPattern.interfaces;

import java.util.Iterator;

import com.dzrrcreations.designpatterns.IteratorDesignPattern.classes.SongInfo;

public interface SongIterator {

	public Iterator<SongInfo> createIterator();
	
	
}
