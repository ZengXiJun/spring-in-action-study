package com.jesse.springstudy;

import java.io.Serializable;

public class StudentServiceImpl implements StudentService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7931465412875977675L;

	public void study(String str) {
		
		 System.out.println("study spring mvc: " + str);
	}
	
	public void inits() {
		System.out.println("initializing...");
	}
	
	public void shutdown() {
		System.out.println("shutdown...");
	}

}
