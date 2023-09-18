package studyopedia;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int grade = scan.nextInt();
		
		checkGrade(grade);
		
		

	}
	public static void checkGrade(int grade)
	{
		if (grade >50)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}

}
