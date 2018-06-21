package com.basic;

public class WhileExampleProgramme {
	public static void main(String []args)
	{
		
		int r,sum=0,input1=252;
		int input=input1;
		while(input1>0){
			r=input1%10;
			sum=(sum*10)+r;
			input1=input1/10;
		}
		if(input==sum)
		{
			System.out.println(2);
		}
		else{
			System.out.println(1);
		}
	}

}
