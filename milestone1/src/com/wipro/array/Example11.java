package com.wipro.array;

public class Example11 {

	public static void main(String[] args) {
		int[] a=new int[] {1,1,1,4};
		int c=0;
		for(int i=0;i<a.length;i++) {
			 if(a[i]!=1&&a[i]!=4)
				c++;
		}
		if(c>0)
			System.out.println("False");
		else
			System.out.println("True");
	}
	}

