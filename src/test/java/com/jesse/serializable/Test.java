package com.jesse.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	private static void SerializePerson(Person person) throws FileNotFoundException, IOException {

		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E:\\Person.txt")));
		oos.writeObject(person);
		System.out.println("序列化成功!");
		
		oos.close();
	}
	
	private static Person DeSerializePerson() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\Person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("反序列化成功!");
		return person;		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Person person = new Person();
		person.setName("曾希君");
		person.setSex("男");
		person.setAge(30);
		
		/*SerializePerson(person);*/
		
		Person personNew = DeSerializePerson();
		
		System.out.println(personNew.toString());
		
		
	}
	

}
