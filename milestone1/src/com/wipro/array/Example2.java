package com.wipro.array;

public class Example2 {
	public static void main(String[] args) {
		int[] x=new int[] {-1,-2,3,4,5};
		int max=0,min=6;
		for(int i=0;i<=x.length;i++)
		{
			if(x[i]>max)
				max=x[i];
			if(x[i]<min)
				min=x[i];
		}	
		System.out.println(max);
		System.out.println(min);
		}
	}

