package examPracticeProgram;
//wap to find product of even number in range 1 to 10
public class ProductOfEvenNumber {
public static void main(String[] args) {
	int n=1;
	int product=1;
	int sum=0;
	while(n<=10)
	{
		if(n%2==0)
		{
			product=product*n;
		}
		else
		{
			sum=sum+n;
		}
		n++;
	}
	System.out.println("Product Of Even no in range 1 to 10 is : "+product);
	System.out.println();
	System.out.println("The sum of odd no in range 1 to 10 is : "+sum);
}
}
