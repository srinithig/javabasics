package com.object;
import java.util.Scanner;
public class Findpassword {
	 public static void main(String args[]) {
	      int count=0;
	      int d=0;
	      int c=0;
	      int a[]=new int[10];
	      int t[]=new int[10];
	      int b[]=new int[10];
	      int n;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the Array Element");
	      for (int j=0;j<5;j++)
	      {
	        a[j]=sc.nextInt();
	        n=a[j];
	       count=0;
	      for(int i=0;i<n;){
	          n=n/10;
	       count=count+1;}
	      System.out.println("count"+count);
	      for (int i = 0; i< count; i++) {
	        t[i]=a[j]%10;
	        a[j]=a[j]/10;
	        System.out.println("t[]"+t[i]);
	      }
	        for(int k=0;k<count;k++)
	      {   
	        c=0;
	       for(int l=0;l<count;l++ )
	        {
	           if(t[k]==t[l])
	          {
	            c++;
	          }
	          else
	          {
	            d++;
	          }
	           }
	        b[k]=c;
	        System.out.println("c"+b[k]);
	      }
	    int v=0;
	        int s=0;
	      for (int e = 0; e < count; e++) {
	          
	        if(b[e]==b[e+1])
	        {
	         v++;
	          
	        }
	        else
	        {
	          s++;
	          
	        }System.out.println("s"+s);System.out.println("v"+v);
	  }
	      }
	    }
	          }
	      
