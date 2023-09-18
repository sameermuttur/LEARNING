package studyopedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= scan.nextInt();
		calculate c1= new calculate();
		c1.calculateSum(n);
	}
	
	

}
