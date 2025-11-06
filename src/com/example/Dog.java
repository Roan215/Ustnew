package com.example;

public class Dog {
	int legs=4;
	void eat() {
		System.out.println("dog eats food");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println("dogs have "+d.legs+" legs");
		d.eat();
	}
}
