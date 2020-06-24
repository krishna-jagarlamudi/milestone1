package com.wipro.array;

public class Example7 {
	/*public static void main(String[] args) {
		int a[]= {12,12,12,45,32,32,45};
		int len=a.length;
		System.out.print("Array with duplicate elements: ");
		for(int i=0;i<=len-1;i++)
		{
			System.out.print(a[i]+" ");
		}
			
		for(int i=0;i<=len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[len-1];
					len--;
					
				
				}
			}
		}
		System.out.println();
		System.out.print("Array without duplicate elements: ");
		for(int i=0;i<=len-1;i++)
		{
			System.out.print(a[i]+" ");
		}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,12,15,60,12,85,6};
		int len=a.length;
		System.out.print("array with duplicate elements:");
		for(int i=0;i<len-1;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<=len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[j]==a[i])
				{
						a[j]=a[len-1];
						len--;
						//j--;optional
					}
				}
			}
		
			System.out.println();
			System.out.print("Arrays without duplicate:");
			for(int j=0;j<=len-1;j++) {
				System.out.print(a[j]+" ");
			}
	}
}


