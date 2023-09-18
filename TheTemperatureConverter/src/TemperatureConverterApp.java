import java.util.Scanner;

import studyopedia.TemperatureConverter;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit :");
		double fahrenheit = scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(fahrenheit));
	}

}
