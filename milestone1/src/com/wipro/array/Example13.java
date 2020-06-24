package com.wipro.array;

public class Example13 {
	public static void main(String[] args) {
		int i,j;
		int l=args.length;
		int x[][]=new int[2][2];
		if(l<4)
		{
			System.out.println("enter 4 values");
			
		}
		if(l==4)
		{
			int k=0;
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					x[i][j]=Integer.parseInt(args[k]);
					k++;
					//System.out.println("x[][]"+x[]);
				}
			}
		}
			for(i=0;i<2;i++)
			{
				for(j=0;j<2;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			for(i=1;i>=0;i--)
			{
				for(j=1;j>=0;j--)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
				
			}
		}
	}


