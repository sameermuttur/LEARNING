package studyopedia;

import java.util.Scanner;

public class MyWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printFibonacciSeries(n);
		
	}
	public static void printFibonacciSeries(int n)
	{
		int num1=0;
		int num2=1;
		int nextnum=0;;
		
			if(n==1)
			{
				System.out.println(num1);
			}
			else if(n==2)
			{
				System.out.println(num2);
				
			}
			else
			{
				for(int i=3;i<=n;i++)
				{
					nextnum=num1+num2;
					num1=num2;
					num2=nextnum;
					
				}
				System.out.println(nextnum);
			
		}
	}

}
