package com.object;

public class Clone implements Cloneable {
	public Clone() {
	}
	public static void main(String[] args) {
		try {
			Clone ceOne = new Clone();
			Clone ceTwo = (Clone)ceOne.clone();
			System.out.println(ceOne.hashCode() + "==="+ceTwo.hashCode());
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
