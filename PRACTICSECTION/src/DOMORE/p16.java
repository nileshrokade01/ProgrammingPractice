package DOMORE;
//wap to find all the prime no in the range of 100
import java.util.Scanner;
public class p16 {

	public static void main(String[] args) 
	{
		//;
		//int n=100;
		for(int n=1;n<=100;n++)
		{
			//Scanner sc=new Scanner(System.in);
			//n=sc.nextInt();
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(n);
			}
		}
		

	}

}
