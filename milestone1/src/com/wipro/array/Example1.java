package com.wipro.array;

public class Example1 {
public static void main(String[] args) {
	int[] x= {1,2,3,4,5};
	int sum=0;
	for(int i=0;i<x.length;i++)
	{
		sum+=x[i];
	}
	System.out.println(sum);
	System.out.println(sum/x.length);
}
}
