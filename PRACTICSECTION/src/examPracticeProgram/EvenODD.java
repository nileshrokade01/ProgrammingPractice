package examPracticeProgram;
//wap to print a no even no in range 21 to 40 and odd no in range 41 to 50 
public class EvenODD {
public static void main (String[]args)
{
	for(int i=1;i<=50;i++)
	{
		if(i>19 && i<51)
		{
		if(i%2==0)
		{
			System.out.print("     "+"Even no : "+i);
		}
		else
		{
			System.out.println("     "+"Odd no : "+i);
		}
		}
	}
}
}
