package DOMORE;
//wap to check if the year is leap year or not
public class p45 {
	//1900 1800
	public static void main(String[] args) {
		int year=2020;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a Leap year");
				}
			}
			else
			{
			System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}

}
