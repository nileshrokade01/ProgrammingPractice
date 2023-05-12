package examPracticeProgram;
//wap to find perfect in the range 1 to 100
public class PerfectNumber {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=100;i++)
	{
		sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
				
			}
		}
		if(sum==i)
		{
			System.out.println(i+" : is perfect number");
		}
	}
}
}
