package com.basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner scanner=new  Scanner(System.in);
		System.out.println("enter the num");
		int input1=scanner.nextInt();
		int length=Integer.toString(input1).length();
		int a=length/2;
		int b=length%2;
		int count=0,count1=0;
		int arr[]=new int[10];
		while(input1>0) {
			int r=input1%10;
			arr[r]=arr[r]+1;
			input1=input1/10;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=2) {
				count++;
			}
			else if(arr[i]==1) {
				count1++;
			}
		}
	System.out.println(count);
	System.out.println(count1);
		
		if(count==a && b==count1) {
			System.out.println("2");
		}
		else {
			System.out.println("1");
		}
	}
}
	