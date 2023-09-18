package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Temperature Conversion Tool!");

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Select an option:");
		System.out.println("1. Convert Celsius to Fahrenheit.");
		System.out.println("2. Convert Fahrenheit to Celsius.");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		
		
		
		
		
		
		 
		
		if (choice==1)
		{
			System.out.print("Enter the Temperature in Celcius : ");
			double cel = scan.nextDouble();
			double res1=celsiusToFahrenheit(cel);
			System.out.println(cel+"C is equivalent to "+res1+"F");
			
		}
		

		else if (choice==2)
		{
			System.out.print("Enter the Temperature in Fahrenheit : ");
			double far = scan.nextDouble();
			double res2=fahrenheitToCelsius(far);
			System.out.println(far+"F is equivalent to "+res2+"T");
			
		}
		
		else
		{
			System.out.println("Invalid Input...");
		}
		
		
	}
	

	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius * 9/5) + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32) * 5/9;
	}
	

	
}
