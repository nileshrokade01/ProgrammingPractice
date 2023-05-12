package examPracticeProgram;
import java.util.InputMismatchException;
import java.util.Scanner;
//wap to find factorial in range of User 
public class FactorialINRangeOFuser {
public static void main(String[] args) {
	System.out.println("Enter the input/number to find factorial in range of that number5 ");
	Scanner scan=new Scanner(System.in);
	try {
		int n=scan.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println("factorial of : "+ i+ " " + fact);
		}
	}
	catch(ArithmeticException ae)
	{
		System.out.println("ArithmeticException Handled");
	}
	catch(InputMismatchException ip)
	{
		System.out.println("InputputMismatchException Handled");
	}
	
	
}
}
