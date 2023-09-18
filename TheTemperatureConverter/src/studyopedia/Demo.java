package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit :");
		double f = scan.nextDouble();
		
		TemperatureConverter tc = new TemperatureConverter();
		double Celsius = tc.convertFahrenheitToCelsius(f);
		System.out.println("The Temperature in Celsius is : "+(Celsius));
		
		
		
		
		
	}

}
