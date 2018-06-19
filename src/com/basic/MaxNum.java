package com.object;

public class MaxNum {
public static void main(String []args) {
	int a=0;
	int b=0;
	int A[]= {10,20,3,-70,8};
	for(int i=0;i<A.length;i++) {
		if(a<A[i]) {
			b=a;
			a=A[i];
			
		}
	}
System.out.println(a  + "are" + b);
}
}