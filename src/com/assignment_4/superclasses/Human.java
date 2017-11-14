package com.assignment_4.superclasses;
/**
 * 
 * @author cornelia, Miruna
 * @version 1.0
 * This is a superclass with two attributes
 
 */
public class Human {
	private String Name = "";
	private int age = 0;
	/***
	 * This is the constructor which takes all the attributes. 
	 * @param name
	 * @param age
	 */
	
	public Human(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}
	/**
	 * We have getters and setters for the attributes
	 * @return name, age 
	 */
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
