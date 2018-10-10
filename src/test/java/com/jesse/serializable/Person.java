package com.jesse.serializable;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 4870039309318500153L;
	
	String name;
	String sex;
	int age;
	int tall;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
	

}
