package com.kodnest.javapatterns.level3;

public class pK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		for(int i=0;i<=10;i++)
		{
		for(int j=0;j<=10;j++)
		{
			if(j==0 || (j==0 &&i==5 ) || (j==1 &&i==4) || (j==2 &&i==3) || (j==3 &&i==2) || (j==4&&i==1) || (j==5&&i==0)
					|| (j==1 &&i== 6) || (j==2 &&i==7) || (j==3 &&i==8) || (j==4 &&i==9) || (j==5 &&i==10) )
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
