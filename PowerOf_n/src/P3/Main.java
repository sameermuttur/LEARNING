package P3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		
		Counting c1=new Counting();
		int Digi = c1.countDigits(num);
		System.out.println("The total numbers in "+num+" is "+Digi);
		
	}

}
