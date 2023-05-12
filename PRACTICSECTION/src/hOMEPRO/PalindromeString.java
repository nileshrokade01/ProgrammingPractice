package hOMEPRO;
//wap to check the given string is palindrome or not
public class PalindromeString 
{
	public static void main(String[] args) {
		String s="nayan ";
		String rev="";
		s=s.trim();
		System.out.println(s);
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("The string is not pallindrome");
		}
	}

}
