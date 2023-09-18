package studyopedia;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		float x = scan.nextInt();
		float y= scan.nextInt();
		String z = scan.next();
		
		calculate(x,y,z);
	

	}
	public static void calculate(float a,float b,String z)
	{
	 switch(z)
	 {
		 case "+":
			 System.out.println("Addition of two numbers is : "+ (a+b));
			 break;
			 
		 case "-":
			 System.out.println("Subtraction of two numbers is : "+(a-b));
			 break;
			 
		 case "*":
			 System.out.println("Multiplication of two numbers is : "+(a*b));
			 break;
			 
		 case "/":
			 System.out.println("Division of two numbers is : "+(a/b));
			 break;	 
			 
			 default:
				 System.out.println("Invalid Input...");
			 
	 }
	}
	
}
