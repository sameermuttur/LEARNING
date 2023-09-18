package studyopedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Power p1 = new Power();
		int res = p1.power(n);
		System.out.println(res);

	}

}
