package com.kodnest.javapatterns.level3;

public class pV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int i=0;i<=n;i++)
		{
		for(int j=0;j<=n;j++)
		{
			if( (j==0 && i<n/2) || (j==n && i<n/2)||(i>4 && j==i-5)||(i>4 && j==15-i) )
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
