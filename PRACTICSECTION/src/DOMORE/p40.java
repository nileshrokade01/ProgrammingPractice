package DOMORE;
//wap to find special no
public class p40
{

	public static void main(String[] args) {
		
		int n=39;
		int t=n;
		//int pr=0;
		int sum=0;
		int pro=1;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			pro=pro*d;
			
			n=n/10;
		}
		 int res=pro+sum;
		if(t==res)
		{
			System.out.println("special no");
		}
		else
		{
			System.out.println("not special no");
		}
	}
}
