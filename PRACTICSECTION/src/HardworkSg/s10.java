package HardworkSg;
// wap to check the given String is palindrome or not
import java.util.Scanner;
public class s10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String as an Input");
	
	String s = sc.next();
	s.trim();
	String temp = s;
	String rev = "";
	//s="nil";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);  //"l" + i "li"+n ="lin"
	}
	System.out.println(rev);
	if(s.equalsIgnoreCase(rev))
	{
	   System.out.println("The given String is Palinedrome");
	}
	else
	{
		System.out.println("Not Palinedrom String");
	}
}
}
