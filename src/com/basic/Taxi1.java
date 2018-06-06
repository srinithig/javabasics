package com.object;



public class Taxi1 extends Car1 {
		int i=100;
		//constructor chaining
		public Taxi1() {
			//super();
			System.out.println("Taxi1 cons empty");
		}
		public Taxi1(int i) {
			//super(i);
			//this();
		System.out.println("Taxi1 cons one arg");
		}


	@Override
	public void brake() {
		System.out.println("Taxi1 brake");
	}
	public static void main(String[] args) {
		Taxi1 taxi1=new Taxi1();
		taxi1.brake();
		Car1 car1=new Taxi1();
		car1.brake();
		System.out.println(car1.i);
		System.out.println(car1 instanceof Taxi1);
	}// TODO Auto-generated method stub

	}
		

