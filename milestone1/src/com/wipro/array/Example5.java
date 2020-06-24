package com.wipro.array;
//import java.util.Arrays;
public class Example5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {4,6,33,1,25,9,5};
		int max=0,min=9,max1=0,min1=9;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
			if(a[i]>max1&&a[i]!=max)
				max1=a[i];
			if(a[i]<min1&&a[i]!=min)
				min1=a[i];
		}
		System.out.println("Two largest numbers in array: "+max+","+max1);
		System.out.println("Two smallest numbers in array: "+min+","+min1);
	}
}
