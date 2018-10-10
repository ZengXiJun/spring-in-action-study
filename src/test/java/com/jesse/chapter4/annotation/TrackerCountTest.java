package com.jesse.chapter4.annotation;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TrackCounterConfig.class)
public class TrackerCountTest {
	
	@SuppressWarnings("deprecation")
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private TrackCounter counter;
	
	@Test
	public void testTrackCounter() {
		cd.play(1);
		cd.play(2);
		cd.play(3);
		cd.play(3);
		cd.play(3);
		cd.play(3);
		cd.play(7);
		cd.play(7);
		
		assertEquals(1, counter.getPlayCount(1));
		assertEquals(1, counter.getPlayCount(2));
		assertEquals(4, counter.getPlayCount(3));
		assertEquals(0, counter.getPlayCount(4));
		
		assertEquals(0, counter.getPlayCount(5));
		assertEquals(0, counter.getPlayCount(6));
		assertEquals(2, counter.getPlayCount(7));
		
	}

}
