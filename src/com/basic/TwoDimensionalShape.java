package com.basic;

public class TwoDimensionalShape extends shape {
	float width,area;
	public void square(int length)
	{
		area=length*length;
		System.out.println("square:"+area);
	}
	public void rectangle(int length,int width)
	{
		area=length*width;
		System.out.println("rectangle:"+area);
	}
	public static void main(String[] args) {
		{
			TwoDimensionalShape twoshapes=new TwoDimensionalShape();
			twoshapes.display();
			twoshapes.square(10);
			twoshapes.rectangle(10,6);
	}
		
	}

}
