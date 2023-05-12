package examPracticeProgram;
//wap to find sum of all the factors in range 7 to 20
public class SumOFAllFactors {
public static void main(String[] args) {
	int sum=0;
	int n=7;
	for(int i=n;i<20;i++)
	{
		sum=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		System.out.println("Sum of factor : "+i+" "+sum);
	}
}
}
