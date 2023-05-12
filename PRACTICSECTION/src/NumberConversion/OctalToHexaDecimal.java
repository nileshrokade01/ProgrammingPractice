package NumberConversion;
//wap to convert the no. octal to Hexadecimal
public class OctalToHexaDecimal 
{
	public static void main(String[] args) 
	{
		int n=161632;
		int sum=0;
		int power=0;
		
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d*pow(8,power);
			power++;
			n=n/10;
			
		}
		String res="";
		while(sum!=0)
		{
			int r=sum%16;
			if (r==10)
			{
				res="a"+res;
			}
			else if(r==11)
			{
				res="b"+res;
			}
			else if(r==12)
			{
				res="c"+res;
			}
			else if(r==13)
			{
				res="d"+res;
			}
			else if(r==14)
			{
				res="e"+res;
			}
			else if(r==15)
			{
				res="f"+res;
			}
			else
			{
				res=r+res;
			}
			sum=sum/16;
		}
		System.out.println(res);
		
		
		
	}
	public static int pow(int n,int p)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		return res;
	}

}
