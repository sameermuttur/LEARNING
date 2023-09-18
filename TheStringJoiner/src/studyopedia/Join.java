package studyopedia;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name and last name");
		String first_name = scan.nextLine();
		String last_name = scan.nextLine();
		System.out.println( joinStrings( first_name, last_name));
		

	}

	public static String joinStrings(String str1,String str2)
	{
		return str1 + " "+str2;
	}
}
