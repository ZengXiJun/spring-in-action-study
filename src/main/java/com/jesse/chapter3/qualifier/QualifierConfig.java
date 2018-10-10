package com.jesse.chapter3.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.jesse.chapter3")
/*@ImportResource("classpath:spring-mvc.xml")*/
public class QualifierConfig {
	
/*	@Bean
	@Qualifier("cold")
	public Dessert iceCream() {
		
		return new IceCream();
	}*/
	

}
