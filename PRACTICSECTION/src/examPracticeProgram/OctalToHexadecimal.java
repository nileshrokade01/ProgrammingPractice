package examPracticeProgram;
//wap to convert the octal number into hexadecimal number
public class OctalToHexadecimal {
	public static int pow(int p,int n)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		return res;
	}
public static void main(String[] args) {
	int n=161632;
	String s="";
	int sum=0;
	int power=0;
	
	while(n!=0)
	{
		int d=n%10;
		sum=sum+pow(power,8)*d;
		power++;
		n=n/10;
	}
	n=sum;
	while(n!=0)
	{
		int d=n%16;
		if(d>9 && d<16)
		{
			if(d==10)
			{
				s="a"+s;
			}
			else if(d==11)
			{
				s="b"+s;
			}
			else if(d==12)
			{
				s="c"+s;
			}
			else if(d==13)
			{
				s="d"+s;
			}
			else if(d==14)
			{
				s="e"+s;
			}
			else if(d==15)
			{
				s="f"+s;
			}
		}
		else 
		{
			s=d+s;
		}
		n=n/16;
	}
	System.out.println(s);
}
}
