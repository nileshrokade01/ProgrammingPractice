package examPracticeProgram;
//wap to check the given no is perfect square  or not
// perfect Square 25 = 5*5 this number is perfect square
// 
public class PerfectSquare {
public static void main(String[] args) {
	int n=81;
	for(int j=1;j<=1000;j++)
	{
		
	
	for(int i=1;i<=j;i++)
	{
		if(i*i==j)
		{
			System.out.println(i+" is Perfect Square of "+j);
			
		}
//		else
//		{
//			System.out.println("Not a perfect square");
//			
//		}
	}
	}
	
}
}
