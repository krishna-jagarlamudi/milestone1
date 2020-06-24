package com.wipro.array;

public class Example14 {
	public static void main(String[] args) {
		int i,j,max=0;
		int l=args.length;
		int x[][]=new int[10][10];
		if(l<9)
		{
			System.out.println("enter 4 values");
			
		}
		for(i=0;i<=l-1;i++)
		{
			for(j=0;j<l;i++)
			{
		if(x[i][j]>max)
			max=x[i][j];
		}
		System.out.println(max);
		if(l==9)
		{
			int k=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					x[i][j]=Integer.parseInt(args[k]);
					k++;
					//System.out.println("x[][]"+x[]);
				}
			}
		}
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
			}
			for(i=2;i>=0;i--)
			{
				for(j=2;j>=0;j--)
				{
					System.out.print(x[i][j]+" ");
				}
				System.out.println();
				
			}
		}

}
}
