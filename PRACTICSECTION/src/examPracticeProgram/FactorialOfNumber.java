package examPracticeProgram;
//wap to find factorial of number
public class FactorialOfNumber {
public static void main(String[] args) {
	int n=10;
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
