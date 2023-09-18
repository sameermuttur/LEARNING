package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = scan.nextInt();
		
		Armstrong a1=new Armstrong();
		boolean res = a1.isArmstrong(num);
		if(res==true)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}

	}

}
