package DOMORE;
//WAP TO FIND NEVEN NO IN RANGE 1 TO 100
public class p30 {

	public static void main(String[] args)
	{
		for(int n=1;n<=1000;n++)
		{
			int sum=0;
			int temp=n;
			while(n!=0)
			{
				int d=n%10;
				int fact=1;
				
				for(int i=1;i<=d;i++)
				{
					fact=fact*1;
				}
				sum=sum+fact;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println(temp);
			}
			n=temp;
		}
		
		
	}

}
