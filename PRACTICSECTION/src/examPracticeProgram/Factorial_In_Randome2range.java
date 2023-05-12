package examPracticeProgram;
//wap to find factorial in random range
public class Factorial_In_Randome2range {
public static void main(String[] args) {
	int n=5;
	int fact=1;
	for(int i=5;i<=100;i++)
	{
		fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
		}
		System.out.println(fact);
	}
}
}
