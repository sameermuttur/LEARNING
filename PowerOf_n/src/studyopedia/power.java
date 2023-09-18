package studyopedia;

public class power {
	
	int powerOfn(int num,int n)
	{
		int Finalresult=1;
		for(int i=1;i<=n;i++)
		{
			Finalresult=Finalresult*num;
				
		}
		return Finalresult;
	}

}
