package examPracticeProgram;
//wap to print odd digit in given number
public class OddDigit {
public static void main(String[] args) {
	int n=34560;
	while(n!=0)
	{
		int d=n%10;
		if(d%2==1)
		{
			System.out.println("odd digit is : "+d);
		}
		n=n/10;
		
	}
}
}
