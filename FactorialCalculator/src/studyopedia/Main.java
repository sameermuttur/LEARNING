package studyopedia;

import java.util.Scanner;

public class Main

{

public static void calculateFactorial(int n)

{
int sum=1;
for(int i=1;i<=n;i++)
{
	sum=sum*i;
}
	System.out.println(sum);
}

public static void main(String[] args)

{

	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	calculateFactorial(n);

}

}
