package examPracticeProgram;
//wap to check the no is prime no or not
import java.util.Scanner;
public class PrimeNumber {
	final static public void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime no or not");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The given number is prime number");
		}
		else
		{
			System.out.println("This no is not a prime no");
		}
			
	}
}
