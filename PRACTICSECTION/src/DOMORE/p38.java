package DOMORE;
//WAP TO FIND HOW MANY DIGITS IN NO...?  //wap to find number of digits in a number..
public class p38 {

	public static void main(String[] args)
	{
		
		int n=51200;
		int count=0;
		while (n!=0)
		{
			//int d=n%10;  no need of var d
		    count++;
		    n=n/10;
		}
		System.out.println(count);
	}

}
