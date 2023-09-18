package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the purchase amount : ");
		int amount = scan.nextInt();
		
		System.out.print("Enter the tax rate (in decimal form): ");
		double tax = scan.nextDouble();
		
		double res= calculateTotalWithTax(amount,tax);
		System.out.println("Total cost including tax : "+ res);

	}
	public static double calculateTotalWithTax(double purchaseAmount, double taxRate)
	{
		return (purchaseAmount*taxRate)+purchaseAmount;
	}

	
}
