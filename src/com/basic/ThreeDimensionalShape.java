package com.basic;

public class ThreeDimensionalShape extends shape {
float radius;
double area;
public void sphere(int radius)
{
	area=4*3.14*radius*radius;
	System.out.println("sphere:"+area);
}
public void cube(int length)
{
	area=6*length*length;
	System.out.println("cube:"+area);
}
public static void main(String[] args) {
	ThreeDimensionalShape threeshapes=new ThreeDimensionalShape();
threeshapes.display();
threeshapes.sphere(7);
threeshapes.cube(8);

}

}
