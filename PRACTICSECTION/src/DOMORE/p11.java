package DOMORE;
//WAP TO FIND SUM OF  ALL FACTORS NO
public class p11 {

	public static void main(String[] args)
	{
		int sum=0;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				
				sum=sum+i;
				
			}
			
			
		}
		System.out.println(sum);
	}

}
