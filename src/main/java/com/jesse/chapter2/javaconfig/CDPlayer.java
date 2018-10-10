package com.jesse.chapter2.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CDPlayer implements MediaPlayer{
	
	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
	
	@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}

}
