package com.object;

public class StringExamples {
public StringExamples() {
}
public static void main(String[] args) {
	String one = "Good"; //String literal
	String oneObj = new String("Good"); // String object
	String two = "Good";
	System.out.println(one == two);
	System.out.println(one.equals(two));
	System.out.println(one.equals(oneObj));
	
}
}
