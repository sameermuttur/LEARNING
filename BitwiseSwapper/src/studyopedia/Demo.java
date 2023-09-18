package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int a = scan.nextInt();
		
		System.out.println("Enter the second integer: ");
		int b = scan.nextInt();
		
		swapUsingBitwise(a,b);
		
		
	
		
	}
	public static  void swapUsingBitwise(int x, int y)
	{
		int temp = x^y;
		x= temp^x;
		y=temp^y;
		System.out.println("First = "+x+ " Second = "+y);
		
		
	}

}
