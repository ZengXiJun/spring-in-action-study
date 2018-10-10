package com.jesse.chapter3.qualifier;

import org.springframework.stereotype.Component;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {
	
/*	private Dessert dessert;
	
	@Autowired
	@Qualifier("iceCream")
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public void eat() {
		dessert.eat();
	}*/
	
}
