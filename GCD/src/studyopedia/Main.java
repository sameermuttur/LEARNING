package studyopedia;

import java.util.Scanner;

public class Main

{

public static void findGCD(int a, int b)

{
	while(b!=0)
	{
		int rem=a%b;
		a=b;
		b=rem;
		
	}
	System.out.println("GCD of given numbers is : "+a);
	

}

public static void main(String[] args)

{
Scanner scan = new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
findGCD(a,b);

}

}
