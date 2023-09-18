package studyopedia;

public class Check {
	
	 int Palindrome(int n)
	{
		int original =n;
		int rev =0;
		
		while(n>0)
		{
		
			int LD=n%10;
			rev=rev*10+LD;
			n=n/10;
		}
		return rev;
		
	}
	

}
