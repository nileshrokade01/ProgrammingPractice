package DOMORE;
//WAP TO PRINT THE USER NO IS NEVEN NO OR NOT
import java.util.Scanner;
public class p27
{
	
	public static void main(String []args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=10;i++)
		{
		System.out.println("ENTER A VALUE/NUMBER");
		int n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("THE GIVER NO. IS NEVEN NUM NUMBER");
			
		}
		else
		{

			System.out.println("THE GIVER NO. IS NOT NEVEN NUMBER");
		}
		
		}
		
	}

}
