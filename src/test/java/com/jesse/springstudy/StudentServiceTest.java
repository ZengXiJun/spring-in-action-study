package com.jesse.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc-init-destroy.xml");
		
		StudentService student = ctx.getBean("studentService", StudentService.class);
		
		student.study("ok");
		
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
