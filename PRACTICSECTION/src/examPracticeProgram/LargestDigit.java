package examPracticeProgram;
//wap to find the largest digit in the given number
public class LargestDigit {
public static void main(String[] args) {
	long n=7899932;
	long large=0;
	long slarge=0;
	while(n!=0)
	{
		long d=n%10;
		if(d>large)
		{
			slarge=large;
			large=d;
			
		}
		else if(d>slarge && d!=large)
		{
			slarge=d;
		}
		n=n/10;
	}
	System.out.println(large);
	System.out.println(slarge);
}
}
