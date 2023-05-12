package examPracticeProgram;
//wap to find the factors of number in range 1 to 10
public class Factors {
public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		System.out.println("Factor of : "+i+" is " );
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				System.out.print(" "+j+"," );
			}
		}
		System.out.println();
	}
}
}
