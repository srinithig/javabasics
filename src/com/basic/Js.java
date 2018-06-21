package com.object;

public class Js {
	static final int Ksrcolleges = 234;
      static void printDistinct(String str)
    {
        int[] count = new int[Ksrcolleges];
        int i;
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n = i;
           for (i = 0; i < n; i++)
            if (count[(int)str.charAt(i)] == 1)
                System.out.print(str.charAt(i));
    }
       public static void main(String args[])
    {
        String str = "ksrcolleges";
        printDistinct(str);
    }
}

