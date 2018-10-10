package com.jesse.chapter2.annotation;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	public void play() {
		System.out.print("Palying " + title + " by " + artist);
	}

}
