package com.qa.example;

public class Person {

//1)Create a Person class with a few variables (height, name, shoe size, job title, age). 
//2) Generate a constructor with all of them. 
//3) Create another constructor that only has name and height. 
//4) Create 2 methods that use these variables (e.g. greet - similar to the one I showed you). They SHOULD NOT be static. 
//5) Create 4 instances of the Person class in your runner and call the methods. 
//6) Upload your code to GitHub.

//Attributes
	private String name;
	private int age;
	private double shoeSize;
	private String jobTitle;
	private double height;
	
//Constructor with all
	public Person(String name, int age, double shoeSize, String jobTitle, double height) {
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.height = height;
	}

//Constructor with only name + height
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

//not static method
	public void greet() {
		System.out.println("I am " + name + " age is " + age + " height is " + height + " foot is " + shoeSize + " i work "
				+ jobTitle);
	}

}
