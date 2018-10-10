package com.jesse.chapter3.qualifier;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QualifierConfig.class)
public class QualifierTest {
	

	private Dessert dessert;
	
	@Autowired
	@Cold
	@Fruit
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	
	@Test
	public void dessertShouldNotBeNull() {
		assertNotNull(dessert);
	}
	
}
