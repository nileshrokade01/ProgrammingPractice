package hOMEPRO;

public class methodoverriding
{
	public static void first()
	{
		System.out.println("First arguement");
		
	}
	public static void second(int a)
	{
		a=a+a-a;
		System.out.println("Second arguement: "+a);
	}
	public static void third(char a)
	{
		System.out.println("Third arguement");
	}
	public static void fourth(String s)
	{
		String o="nilesh";
		System.out.println("Fifth arguement");
	}
	
	public static String Last(String sc)
	{
		sc="kil";
	     String c= sc+" "+"the end";
	     return c;
	}
	public static void main(String[] args) {
		System.out.println("method begins");
		System.out.println(Last("NIlesh"));
		first();
		second('k'); //widening
		double d=5.5;
		int p= (int)d;
		second(p);
		second('k');
	}

}
