package String;
//wap to convert integer to string 
public class ConvertIntegerToString {
  //we can convert the integer into string in two ways 
	// 1. by using concatenation (+)
	// 2. by using String.valueOf(VAR) method
	 
	public static void main(String[] args) {
		int n=10;
		String s="";
		s=s+n;
		System.out.println(s);
		/*
		 * int k =Integer.parseInt(s);
		 *  System.out.println("ANS : "+(k+n));
		 */
		
		
		String s1=String.valueOf(n);
		System.out.println(s1);
		
		System.out.println(s+s1);
	}
}
