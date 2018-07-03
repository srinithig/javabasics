package org.wipro;

import java.util.Scanner;

public class AccountNum {
	

	
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String Name=sc.next();
	    long AcNo=sc.nextLong();
	    int Sallery=sc.nextInt();
	    Name=Name.toUpperCase();
	    long sum=0;
	    int S=0;
	    String string="";
	    for(int i=0;AcNo>0;i++)
	    {
	        long r=AcNo%10;
	        AcNo=AcNo/10;
	        if(i%2==0)
	        {
	            sum=(sum*10)+(r+1);
	        }else {
	            sum=(sum*10)+(r-1);
	        }
	       
	    }char a[]=Name.toCharArray();
	    for (int i = 0; i < a.length; i++) {
	        int b=(int)a[i];
	        if(i%2==0)
	        {
	            S=b+1;
	        }else
	        {
	            S=b-1;
	        }
	        if(S<65)
	        {
	            S=90;
	        }else if(S>90)
	        {
	            S=65;
	        }
	        if(i>0)
	        {
	        S=S+32;
	        }
	        char c=(char)S;
	       
	        string=string+c;
	    }
	    System.out.println(sum+string);
	    System.out.println("Jan  "+(Sallery*20)/100);
	    System.out.println("Feb  "+(Sallery*19)/100);
	    System.out.println("Mar  "+(Sallery*25)/100);
	    System.out.println("Apr  "+(Sallery*24)/100);
	    System.out.println("May  "+(Sallery*30)/100);
	    System.out.println("Jun  "+(Sallery*35)/100);
	    System.out.println("Jul  "+(Sallery*34)/100);
	    System.out.println("Agu  "+(Sallery*23)/100);
	    System.out.println("Sep  "+(Sallery*32)/100);
	    System.out.println("Oct  "+(Sallery*15)/100);
	    System.out.println("Nov  "+(Sallery*23)/100);
	    System.out.println("Dec  "+(Sallery*13)/100);
	}
	}

