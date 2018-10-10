package com.jesse.chapter2.javaconfig;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	@SuppressWarnings("deprecation")
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void play() {
		player.play();
		assertEquals (
				"Palying Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
		        log.getLog()
				);
	}

}
