package examPracticeProgram;
//wap to find the sum of each row
public class a11 {
public static void main(String[]args)
{
	int a[][]= {{1,2,3},  //00 01 02
			    {4,5,6},  //10 11 12
			    {7,8,9}}; //20 21 22
	int sum=0,sm=0;
	for(int i=0;i<a.length;i++)
	{
		sm=0;
		for(int j=0;j<a.length;j++)
		{
			
			sum=a[i][j]+sum;
			sm=sm+a[i][j];
			
		}
		System.out.println(sm);
	}
	System.out.println();
	System.out.println("Sumation of each row and column"+sum);
}
}
