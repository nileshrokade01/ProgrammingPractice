package examPracticeProgram;
//wap to find how many digits in number
public class CountDigit {
public static void main(String[] args) {
	int n=8021;
	int count=0;
	while(n!=0)
	{
		count++;
		n=n/10;
	}
	System.out.println(count);
}
}
