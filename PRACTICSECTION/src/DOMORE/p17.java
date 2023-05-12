package DOMORE;
//WAP TO PRINT FOO IF THE NO IS DIVISIBLE BY 5 AND BOO IF THE NO IS DIVISIBLE 7 AND FOOBOO IF THE NO IS DIVISIBLE BOTH 5 AND 7 FOR ALL THE IN THE RANGE OF 1 TO 100
public class p17 {

	public static void main(String[] args)
	{
		for(int n=1;n<=100;n++)
		{
			if(n%5==0 && n%7==0)
			{
				System.out.println("The no is: "+n+"  57fooboo");
			}
			else {
				
			
			if(n%5==0)
			{
				System.out.println("The no is: "+n+"  5Foo");
			}
			else if(n%7==0)
			{
				System.out.println("The no is: "+n+"  7boo");
			}
			}
			
		}

	}

}
