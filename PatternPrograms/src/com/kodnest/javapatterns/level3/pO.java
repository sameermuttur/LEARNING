package com.kodnest.javapatterns.level3;

public class pO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
		{
			if( (j==0 && i!=0 && i!=n) || (i==0 && j!=0 && j!=n) || (j==n && i!=0 && i!=n) || (i==n && j!=0 && j!=n))
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
