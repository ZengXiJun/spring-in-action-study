package com.jesse.chapter3.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("soft")
public class Cake implements Dessert {
	
	

}
