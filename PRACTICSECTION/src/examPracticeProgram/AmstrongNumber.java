package examPracticeProgram;
//wap to find/check if a number is Armstrong number or not
//cube/Square is depend on how many digits are present inside the number
//Armstrong number = 153=1 cube + 5 cube + 3 cube =1+125+27=153
public class AmstrongNumber {
	public static int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		return count;
	}
static public void main( String[] nilesh)
{
	int sum=0,tempu=0,res=1;
	
	for(int i=10;i<=100000;i++)
	{
		int power=countDigit(i);
		
		sum=0;		
		tempu=i;
		while(i!=0)
		{
			int d=i%10;
			res=1;
			for(int j=1;j<=power;j++)
			{
				res=res*d;
			}
			sum=sum+res;
			i=i/10;
		}
		i=tempu;
		if(i==sum)
		{
			System.out.println(i+" Is Armstrong Number");
		}
	}
}
}
