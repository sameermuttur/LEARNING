package com.kodnest.javapatterns.level3;

public class pD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=0;i<=10;i++)
		{
		for(int j=0;j<=10;j++)
		{
			if(j==0 || (i==n/2 && j!=n) || (i==0 &&j<=n-1) || (j==n && i!=n-5 && i!=0 && i!=n) || (i==n && j!=n) )
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