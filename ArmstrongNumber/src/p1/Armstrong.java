package p1;

public class Armstrong {
	
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
	
	
	
	

	boolean isArmstrong(int num)
	{
		int dc=countDigits(num);
		
		int original=num;
		int sum=0;
		while(num!=0)
		{
		int ld=num%10;
		int drp=(int)Math.pow(ld, dc);
		sum=sum+drp;
		num=num/10;
		}
		if(original==sum)
		{
			return true;
		}

		return false;
	
	}
	
}