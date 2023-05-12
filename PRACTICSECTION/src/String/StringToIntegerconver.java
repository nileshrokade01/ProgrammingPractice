package String;
//wap to convert string to integer
public class StringToIntegerconver 
{
	public static void main(String[] args) {
		String s="10";
		String c="22";
		String s1="20";
		System.out.println(s1+s);
		
		System.out.println("-----------------------------");
		System.out.println("converting string to integer by using parsing method");
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s);
		
		
		long  d1=Long.parseLong(c);
		
		System.out.println(a+b);
		
		boolean l=Boolean.parseBoolean(s1);
		l=true;
		double d=Double.parseDouble(s1);
		System.out.println(l);
		System.out.println(d);
		System.out.println(d1);
	}

}
