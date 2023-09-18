package studyopedia;

public class calculate {
	public  void calculateSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int LD=n%10;
			sum=sum+LD;
			n=n/10;
		}
		System.out.println(sum);
	}

}
