package DOMORE;
//WAP TO IS  IF THE NO IS STRONG OR NOT
public class p28 {

	public static void main(String[] args) 
	{
		int n=145;
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int d=n%10; //r
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
			
		}
		if (sum==temp)
		{
			System.out.println("the number is Strong No.");
		}
		else
		{
			System.out.println("Not a Strong No.");
		}
	}

}
