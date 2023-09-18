package com.kodnest.javapatterns.level3;

public class pM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=0;i<=10;i++)
		{
		for(int j=0;j<=10;j++)
		{
			if(j==0 || j==n || (j==1&&i==1)|| (j==2&&i==2)|| (j==3&&i==3)|| (j==4&&i==4)|| (j==5&&i==5)
					|| (j==6&&i==4)|| (j==7&&i==3)|| (j==8&&i==2)|| (j==9&&i==1)|| (j==10&&i==0))
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
