package ArayPrograms;
//wap to check armstrong no present or not
//153=1 cube+5 cube+3cube
public class ArmStronGNUMber0323 
{
	public static void main(String[] args) {
		int n=3375;
		int temp=n;
		int count=0;
		int sum=0;
		
		while(n!=0)
		{
			int d=n%10;
			count++;
			n=n/10;
			
		}
		n=temp;
		
		int k=count;
		//System.out.println(k);
		while(n!=0)
		{
			int d=n%10;
		
			
			sum=d*pow(d,3)+sum;
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println("not an Armstrong no");
		}
	}
		public static int pow(int d,int p)
		{
			int res=1;
			for(int i=1;i<=p;i++)
			{
				res=res*d;
			}
			return res;
		}
	
	
	
	
	
	
	
	
	
	
	
	

}
