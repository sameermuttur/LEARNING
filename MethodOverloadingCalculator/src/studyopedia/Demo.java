package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int a = scan.nextInt();
		
		System.out.print("Enter the second number : ");
		int b = scan.nextInt();
		
		System.out.println("Enter the operator(+,-,/,*) : ");
		String c = scan.next();
		
		switch (c)
		{
		case "+":
			System.out.println("Result : "+calculate(a,b,c));
			break;
			
		case "-":
			System.out.println("Result : "+calculate(a,c,b));
			break;
			
		case "*":
			System.out.println("Result : "+calculate(c,a,b));
			break;
			
		case "/":
			System.out.println("Result : "+calculate(a,c,b));
			break;
			
			default:
				System.out.println("Invalid Input...");
		}
		
		
		
		
	}
	public static double calculate(int x,int y,String z)
	{
		return x+y;
	}
	public static double calculate(int x,String z,int y)
	{
		return x-y;
	}
	public static double calculate(String z,int x,int y)
	{
		return x*y;
	}
	public static double calculate(float x,String z,int y)
	{
		return x/y;
	}
	
	
	

}
