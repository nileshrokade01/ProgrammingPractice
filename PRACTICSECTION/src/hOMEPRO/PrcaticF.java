package hOMEPRO;

public class PrcaticF 
{

	public static void main(String[] args)
	{
		int [][]a= {{36,37,38},{46,47,48},{56,57,58}};
		int r=0;
		int c=0;
		int x=48;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]==x)
				{
					c=i;
					r=j;
					break;
				}
			}
		}
		System.out.println(c);
		System.out.println(r);
		int sum1=0;
		int sum=0;
		if((r+c)%2==0)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(a[i][j]%2==0)
					{
						sum=0;
						int n=a[i][j];
						while(n!=0)
						{
							int d=n%10;
							sum=d+sum;
							n=n/10;
						}
						sum1=sum1+sum;
						
					}
				}
			}
		}
					else
					{
						
						for(int i=0;i<a.length;i++)
						{
							for(int j=0;j<a.length;j++)
							{
								
								if(a[i][j]%2==1)
								{
									sum=0;
									int n=a[i][j];
									while(n!=0)
									{
										int d=n%10;
										sum=d+sum;
										n=n/10;
									}
									sum1=sum1+sum;
					}
				}
			}
		}
		System.out.println(sum1);
		
	}

}
