package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double purchaseAmount = scan.nextDouble();
		checkDiscount(purchaseAmount);		
		
	}
		public static void checkDiscount(double purchaseAmount)
		{
			if (purchaseAmount>=100)
			{
				System.out.println("Discount Applicable");
				
			}
			
		}

}
