package examPracticeProgram;
//wap to print sum of all the digit until
//the sum is become a single digit
//eg. n=555 5+5+5=15 1+5=6
public class SumOfAllDuntilSisSingleD {
public static void main(String[] args) {
	int n=54,sum=0,count=0;
	while(count!=1)
	{
	sum=0;
	count=0;
	while(n!=0)
	{
		int d=n%10;
		sum=sum+d;		
		n=n/10;
		count++;
	}
	n=sum;
	}
	System.out.println(n);
}
}
