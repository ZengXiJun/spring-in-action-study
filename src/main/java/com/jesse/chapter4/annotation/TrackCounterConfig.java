package com.jesse.chapter4.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	
	@Bean
	public CompactDisc sgtPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
		cd.setArtist("The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band by The Beatles");
		tracks.add("2");
		tracks.add("3");
		tracks.add("4");
		tracks.add("5");
		cd.setTracks(tracks);
		
		return cd;
	}

	
	@Bean
	public TrackCounter trackerCounter() {
		return new TrackCounter();
	}
}
