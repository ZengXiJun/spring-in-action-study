package com.jesse.chapter4.xmlconfig;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	
/*	@Pointcut("exectuion(** com.jesse.chapter4.concert.Performance.perform(..))")
	public void performance() {}
	*/
	
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
	
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}

}
