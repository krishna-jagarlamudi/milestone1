package com.wipro.array;

public class Example9 {
public static void main(String[] args) {
/*int[] a=new int[]{1,10,10,2};
int i,x=1;
	for( i=0;i<a.length;i++) {
		if(a[i]==10)
		{
			a[i]=0;
		}
	}
	for(int j=0;j<a.length;j++)
	{
		int temp=0;
		if(a[j]==0)
		{
		temp=a[j];
		a[j]=a[a.length-x];
		a[a.length-x]=temp;
		j++;
			
		}
		
	}
	for(i=0;i<a.length;i++)
	{
	System.out.println(a[i]);
	}*/
	int [] a=new int[] {1,10,10,2,3,10};
	int c=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=10)
		{
			a[c++]=a[i];
		}
	}
	while(c<a.length)
		a[c++]=0;
		for(int j=0;j<a.length;j++)
		{
		System.out.print(a[j]+" ");
		}


}
}
