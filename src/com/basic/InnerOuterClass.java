package com.basic;

public class InnerOuterClass {
	public static void main(String[]args) {
		int j,k;
		outer:for(j=0;j<5;j++) {
			inner:for(k=0;k<3;k++) {
				if (k==1) {
					continue outer;
				}
				if (k==2) {
					continue inner;
				}
				System.out.println("j= "+j+" k= "+k);
				
				}
				
			}
		}
	}
	


