package com.wipro.array;

public class Example8 {
	public static void main(String[] args) {
		int a[]= {7,1,2,3,6};
		int sum=0;
		int len=a.length;
		/*for(int j=0;j<len;j++)
		{
			if(a[j]==6&&a[j+1]==7)
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}*/
		for (int i = 0; i < len; i++) {
		    if (a[i] == 6) {
		        for (int j = i + 1; j < len; j++) {
		            if (a[j] == 7) {
		                i = j+1;
		                continue;
		            }
		        }
		    }
		    sum+=a[i];
		}
		System.out.println(sum);
		
	}

}
