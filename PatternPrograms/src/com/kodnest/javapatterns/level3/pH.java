package com.kodnest.javapatterns.level3;

public class pH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=10;i++)
		{
		for(int j=0;j<=10;j++)
		{
			if(j==0 || j==n || i==n/2)
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
