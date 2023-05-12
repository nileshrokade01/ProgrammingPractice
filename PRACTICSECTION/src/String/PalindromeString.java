package String;
//wap to check the given string is palindrome or not
import java.util.Scanner;
public class PalindromeString 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the String to check wheather it is palindrome or not");
		
		String s=sc.nextLine();
		String rev="";
		//trim() : it is used to remove the starting and ending space
		s=s.trim();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))   //equalsIgnorecase : it is use to make case insensitive
		{
			System.out.println("String is Panlindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
	}

}
