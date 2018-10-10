package com.jesse.chapter2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
	
	@Bean//(name="lonelyHeartsClub")
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean//(name="MediaPlayer")
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	
/*	@Bean(name="cdPlayer2")
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
	
	@Bean(name="cdPlayer3")
	public CDPlayer cdPlayer3(CompactDisc compactDisc) {
		CDPlayer cdPlayer = new CDPlayer(compactDisc);
		cdPlayer.setCompactDisc(compactDisc);
		return cdPlayer;
	}*/
	

}
