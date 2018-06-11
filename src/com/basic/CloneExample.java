package com.object;

public class CloneExample implements Cloneable{
	public CloneExample() {
	
	}
	
	public static void main(String[] args) {
		
		CloneExample ceOne = new CloneExample();
		CloneExample ceTwo = new CloneExample();
		try {
			ceTwo = (CloneExample)ceOne.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(ceOne.hashCode() + " == " +ceTwo.hashCode());
		int a[] = {1,2,1,4,3,4};
		int b[] = new int[a.length];
		/*for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}*/
		System.arraycopy(a, 0, b, 0, b.length);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
}
}
