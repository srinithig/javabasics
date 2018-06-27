package com.object;

public class Character {
   
       
	   static String swap(String str, int i, int j)
	    {
	        if (j == str.length() - 1)
	            return str.substring(0, i) + str.charAt(j)
	             + str.substring(i + 1, j) + str.charAt(i);
	 
	        return str.substring(0, i) + str.charAt(j)
	               + str.substring(i + 1, j) + str.charAt(i) 
	               + str.substring(j + 1, str.length());
	    }
	   public static void main(String[] args) {
	        String s = "Tday is preassessment";
	        System.out.println(swap(s, 6, s.length() - 2));
	        System.out.println(swap(s, 0, s.length() - 1));
	 
	        // Original String doesn't change
	        System.out.println(s);
	    }
	}