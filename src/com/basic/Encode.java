package com.object;
import java.util.Scanner;
public class Encode {
	 public static void findOrginalFirstandSum(int[] input1){
	     int[] array=new int[input1.length];
	       int sum=0;
	       array[array.length-1]=input1[input1.length-1];
	       for(int i=input1.length-2;i>=0;i--){
	           array[i]=array[i+1]-input1[i];
	           sum=sum+array[i];
	       }
	     System.out.println("First Element in Decoded Array: "+array[0]);
	       System.out.println("Sum of Decoded Array: "+(sum+array[array.length-1]));
	    }
	 
	  public static void main(String[] args) {
	    Scanner in= new Scanner(System.in);
	    System.out.print("Enter Size: ");
	    int size=in.nextInt();
	    System.out.print("Enter Array Elements: ");
	    int[] input1= new int[size];
	    for(int i=0;i<size;i++){
	      input1[i]=in.nextInt();
	    }
	    findOrginalFirstandSum(input1);
	    in.close();
	    }
	}



