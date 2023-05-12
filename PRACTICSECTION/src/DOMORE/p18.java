package DOMORE;
//WAP TO FIND PERFECT NO
public class p18 {

	public static void main(String[] args) 
	{
		int n=6;
				int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(sum==n)
		{
			System.out.println("perfect no");
		}
		else
		{
		System.out.println("not a perfect no");
	}}

}
