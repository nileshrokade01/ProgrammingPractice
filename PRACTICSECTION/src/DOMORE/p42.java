package DOMORE;
//1:wap to sum of all the digit until
//2:sum is a single digit number
public class p42 
{
	public static void main(String[] args) {
	int n=56;
	int sum=0;
	while(n!=0 || sum>9)
	{
		if(n==0)
		{
			n=sum;
			sum=0;
		}	
		int d=n%10;
		sum=sum+d;
		n=n/10;
	}
	System.out.println(sum);	
}	
}
