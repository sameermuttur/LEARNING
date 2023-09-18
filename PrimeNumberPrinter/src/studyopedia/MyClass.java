package studyopedia;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {

		System.out.println("Start");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrimes(n);
		 
		
	}
	
	public static boolean checkPrime(int x)
	{
		for(int i=2;i<x;i++)
		{
			
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes(int n)
	{
		int count=0;
		for(int i=2;count<n;i++)
		{
			boolean res=checkPrime(i);
			if(res==true)
			{
				System.out.print(i+" ");
				count++;
			}
		}
	}

}
