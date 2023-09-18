package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Speed and Time to calculate the Distance:");
		double s = scan.nextDouble();
		double t = scan.nextDouble();
		
		JourneyCalculator jc = new JourneyCalculator();
		double distance = jc.calculatrDistance(s,t);
		System.out.println("The total distance travelled is : "+(distance)+" Kms");

	}

}
