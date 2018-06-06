package com.object;

public class Car1 {
	private String model;
	int i = 10;
	private double speed = 20;
	public Car1() {
		System.out.println("empty cons called");}
		public Car1(int speed) {
			this();
			this.speed = speed;
			System.out.println("one arg cons called");
		}
		public Car1(int speed ,String model) {
			this(speed);
			this.speed = speed;
			this.model = model;
			System.out.println("two arg cons called");
				
			}
		public String getModel() {
			return model;
		}
		
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Taxi1 brake");
	}
	}
	

