package com.kodnest.javapatterns.level3;

public class pQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
		{
			if((j==0 && i!=0 && i<=n/2)||(i==0 && j!=0 && j<=n-4)||(j==n-3 && i!=0 && i<=n/2)||(i==n-4 && j!=0 && j<=n-4)
					|| (i>=n-6 && i==j))
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
