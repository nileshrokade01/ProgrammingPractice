package examPracticeProgram;
//wap to find the missing number
public class a14 {
public static void main(String[]args) {
	int[]a= {1,2,3,4,5,6,8,9,10};
	int sum=0;
	int sum1=0;
	for(int i=1;i<=a.length+1;i++)
	{
		sum=sum+i;
		
	}
	for(int i=0;i<a.length;i++)
	{
		sum1=sum1+a[i];
	}
	System.out.println("The missing no is : "+(sum-sum1));
	
}
}
