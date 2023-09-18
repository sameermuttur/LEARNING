package p4;

public class Power {
	int raisedcToPower(int num,int n)
	{
		
			int Finalresult=1;
			for(int i=1;i<=n;i++)
			{
				Finalresult=Finalresult*num;
					
			}
			return Finalresult;
		
	}
	 
	int countDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			 num=num/10;
			count++;
		}
		return count;
	}

}
