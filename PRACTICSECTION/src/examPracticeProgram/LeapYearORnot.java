package examPracticeProgram;
//wap to find the year is leap year or not
public class LeapYearORnot {
	public static void main(String[] args) {
		int n=1600;
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Century Year");
				}
				
			}
			else
			{
				System.out.println("Leap Year");
			}
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
