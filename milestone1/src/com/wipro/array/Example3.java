package com.wipro.array;

public class Example3 {
	public static void main(String[] args) {
		int[] x=new int[]{1,4,25,48,94};
		//char a=args[0].charAt(0);
		//int b=(int)a;
		int i=1,count=0;
		for( int j=0;j<x.length;j++)
		{
			if(i==x[j]) {
				
				System.out.println(j);
		count++;
			}
		}
			if(count==0)
			{
				System.out.println("-1");
				
			}
			
					//break;
		}		
		
	}

	

