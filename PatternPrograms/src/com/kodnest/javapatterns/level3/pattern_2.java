package com.kodnest.javapatterns.level3;

public class pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		
		for(int i=0;i<=10;i++)
		{
		for(int j=0;j<=10;j++)
		{
			if(i==n || j==n)
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
