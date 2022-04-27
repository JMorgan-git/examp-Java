package com.qa.example;

public class Runner {

	public static void main(String[] args) {
		Person john = new Person("John", 20, 6.5, "Cook", 5.9);
		Person amy = new Person("amy", 19, 6, "police", 5.5);
		Person dom = new Person("dom", 55, 8.5, "Airoplane", 5.3);
		Person larry = new Person("lotty", 34, 5.5, "Trains", 5.3);

		john.greet();
		amy.greet();
		dom.greet();
		larry.greet();
	}
}
