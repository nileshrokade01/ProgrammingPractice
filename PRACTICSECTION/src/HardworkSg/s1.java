package HardworkSg;
//wap to print char size,character in same range and sum of their numbers

public class s1 {
	public static void main(String [] args) {
		String s="1BAN2G3ALO4RE";
		System.out.println(s);
		
		System.out.println(count(s)+""+sum(s));
		
		
	}
	public static String count(String s) {
		int count = 0;
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count++;
				//res = s.charAt(i)+res;     b a n g  a+"b"  "gnab"
				res = res + s.charAt(i);
			}
		}
		return count+res;
	}
	public static int sum(String s) {
		int sum = 0;
		for(int i =0 ;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				sum = sum +(s.charAt(i)-48);
			}
		}
		return sum;
	}

}
