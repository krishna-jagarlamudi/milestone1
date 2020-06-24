package com.wipro.array;
import java.util.Arrays; 

public class Example12 {
	public static void main(String[] args) {
		int [] array1= {1,2,3};
		int[] array2= {4,5,6};
		
		int[] array3=new int[] {array1[1],array2[1]};
		System.out.println(Arrays.toString(array3));
	}

}
