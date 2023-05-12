package examPracticeProgram;
//wap to find the prime no in range 1 to 100
public class FIndPrimeInrange1To100 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=100;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" is prime no.  ");
			}
			else
			{
				System.out.println(i+" is not an prime no.");
			}
			//System.out.println();
		}
	}
}
