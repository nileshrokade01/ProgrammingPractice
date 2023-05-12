package examPracticeProgram;
//WAP TO PRINT FOO IF THE NO IS DIVISIBLE BY 5 AND BOO IF THE NO IS DIVISIBLE 7 
//AND FOOBOO IF THE NO IS DIVISIBLE BOTH 5 AND 7 FOR ALL THE IN THE RANGE OF 1 TO 100
public class InterviewQ {
public static void main(String[] args) {
	
	for(int i=1;i<=100;i++)
	{
		if(i%5==0 && i%7==0)
		{
			System.out.println("The no is: "+i+"  57FooBoo");
		}
		else {
			
			if(i%5==0)
		{
			System.out.println("The no is: "+i+"  5Foo");
		}
		else if(i%7==0)
		{
			System.out.println("The no is: "+i+"  7Boo");
		}
		}
	}
}
}
