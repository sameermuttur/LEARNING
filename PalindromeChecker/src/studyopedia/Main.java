package studyopedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		Check P1 = new Check();
		
		int res =P1.Palindrome(n);
		if(n==res) 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
