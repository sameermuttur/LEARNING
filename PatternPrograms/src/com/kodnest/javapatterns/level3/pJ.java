package com.kodnest.javapatterns.level3;

public class pJ {
	public static void main(String[] args) {
	int n=10;
	for(int i=0;i<=10;i++)
	{
	for(int j=0;j<=10;j++)
	{
		if(i==0 || (j==n/2 && i<n) || (i==10 && j==4 || i==10 && j==3))
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

