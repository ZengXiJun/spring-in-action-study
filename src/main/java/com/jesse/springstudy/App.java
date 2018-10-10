package com.jesse.springstudy;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
class Person {
	String name;
	int age;
	Person(){}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public class App 
{
	private static Gson gson = new Gson();
    public static void main( String[] args )
    {
    	Person person = new Person("John", 30);
    	String personToJson = gson.toJson(person);
        System.out.println( personToJson );
    }
}
