package com.kodnest.javapatterns.level3;

public class pG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=0;i<=10;i++)
		{
		for(int j=0;j<=10;j++)
		{
			if( (j==0 && i!=0 && i!=n) || (i==0 && j!=0 && j!=n) || (j==10 && i==1||i==2&&j==10)|| (i==n && j>=1 && j<n)
					 || (j==10 && i==9 || j==10 && i==8) || j==10 && i==7 || j==10 && i==6 ||(i==6 && j>=7 )	)
			{
			System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	}

}
