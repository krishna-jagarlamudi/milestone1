package com.wipro.array;

public class Example10 {
	public static void main(String[] args) {
		int a[]=new int[]{1,0,1,0,0,1,1};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				a[c]=a[i];
				c++;
			}
		
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				a[c]=a[i];
				c++;
			}
		}
		for(int j=0;j<a.length;j++)
		{
		System.out.print(a[j]+" ");
		}
		
	}

}
