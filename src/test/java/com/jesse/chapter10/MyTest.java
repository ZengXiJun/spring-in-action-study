package com.jesse.chapter10;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class)

public class MyTest {
	
	@Autowired
	private SpitterRepository spitterRepository;
	
	@Autowired
	private SpittleRepository spittleRepository;
	
	@Test
	public void print() {
/*		System.out.println(spitterRepository.count());
		System.out.println(spitterRepository.findOne(1).toString());
		System.out.println(spitterRepository.findAll().toString());
		System.out.println(spitterRepository.findByUsername("jesse").toString());
		System.out.println(spitterRepository.save(new Spitter("bonnie", "bonnie", "bonnie zhang", "bonnie@163.com", true)).toString());
		System.out.println(spitterRepository.count());*/
		
		System.out.println(spittleRepository.findOne(6).toString());
		spittleRepository.delete(6);
		System.out.println(spittleRepository.findOne(6).toString());
		
		/*System.out.println(spittleRepository.count());*/
/*		Spitter spitter = new Spitter(1L, "bonnie", "bonnie", "bonnie zhang", "bonnie@163.com", true);
		System.out.println(spittleRepository.save(new Spittle(1L, spitter, "hello bonnie", new Date())).toString());
		System.out.println(spittleRepository.findOne(6).toString());*/
/*		spittleRepository.delete(1);
		System.out.println(spittleRepository.findOne(1).toString());*/
/*		System.out.println(spittleRepository.findBySpitterId(1).toString());
		System.out.println(spittleRepository.findRecent().toString());
		System.out.println(spittleRepository.findRecent(1));
		
		Spitter spitter = new Spitter(1L, "bonnie", "bonnie", "bonnie zhang", "bonnie@163.com", true);
		System.out.println(spittleRepository.save(new Spittle(2L, spitter, "hello bonnie", new Date())).toString());*/
		/*spittleRepository.delete(2);*/
		
	}
	

}
