package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Is input valid (true/false): ");
		boolean input = scan.nextBoolean();
		
		System.out.print("Does input meet a certain condition (true/false): ");
		boolean condition = scan.nextBoolean();
		
		boolean res = isInputValid(input,condition);
		
		if(res==true)
		{
			System.out.println("Input is valid.");
		}
		
		else
		{
			System.out.println("Input is Invalid.");
		}
		
		
		
		
	}
	
	public static boolean isInputValid(boolean a,boolean b)
	{
		return a&&b ;
	}

}
