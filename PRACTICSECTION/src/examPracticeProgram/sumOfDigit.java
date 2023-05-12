package examPracticeProgram;
//wap to find the sum of all the Digit
public class sumOfDigit {
public static void main(String[] args) {
	int sum=0;
	int product=1;
	
	int a=342;
	while(a!=0)
	{
		int d=a%10;
		sum=sum+d;
		product=product*d;
		a=a/10;
	}
	System.out.println(sum);
	System.out.println(product);
}
}
