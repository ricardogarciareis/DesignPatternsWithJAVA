package com.dzrrcreations.designpatterns.CompositeDesignPattern.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.dzrrcreations.designpatterns.CompositeDesignPattern.abstractclasses.SongComponent;

public class SongGroup extends SongComponent {

	private List<SongComponent> songComponents = new ArrayList<SongComponent>();
	private String groupName;
	private String groupDescription;
	
	public SongGroup(String groupName, String groupDescription) {
		super();
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public String getGroupName() { return groupName; }
	public String getGroupDescription() { return groupDescription; }
	
	@Override
	public void add(SongComponent newSongComponent) {
		this.songComponents.add(newSongComponent);
	}
	
	@Override
	public void remove(SongComponent newSongComponent) {
		this.songComponents.remove(newSongComponent);
	}
	
	@Override
	public SongComponent getComponent(int componentIndex) {
		return (SongComponent) this.songComponents.get(componentIndex);
	}
	
	@Override
	public void displaySongInfo() {
		System.out.println("\n" + getGroupName() + " : " + getGroupDescription() + "\n");
		Iterator<SongComponent> songIterator = songComponents.iterator();
		songIterator.forEachRemaining(s -> s.displaySongInfo());
	}
	
}
