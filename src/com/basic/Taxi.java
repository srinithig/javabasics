package com.basic;

public class Taxi extends Car {
	int i=100;
	//constructor chaining
	public Taxi() {
		//super();
		System.out.println("Taxi cons empty");
	}
	public Taxi(int i) {
		super(i);
		//this();
	System.out.println("Taxi cons one arg");
	}

public static void main(String[] args) {
	//Taxi taxi = new Taxi(10);
	Car car = new Taxi();
	
System.out.println(car.i);
System.out.println(car instanceof Taxi);
}
	}
	


