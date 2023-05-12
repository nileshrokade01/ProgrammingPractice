package DOMORE;
//WAP TO FIND STRONG NO IN THE RANGE OF 1 TO 1000
public class p29 {
//1!+2!+3!.....1000!=given value 
	public static void main(String[] args) {
		for(int n=1;n<=1000;n++)
		{
			int sum=0;
			int temp=n;
			
			
			while(n!=0)
			{
				int fact=1;
				int d=n%10;
				for(int i=1;i<=d;i++)
				{
					fact=fact*i;
				}
				
				sum=sum+fact;
				n=n/10;
			}
			
			if(sum==temp)
			{
				System.out.println(temp);
			}
			n=temp;
			
		}
	}
}
