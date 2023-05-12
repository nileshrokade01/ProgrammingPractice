package HardworkSg;
import java.util.Scanner;
public class s14 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your mobile number : ");
	String s = sc.next();
	char []b=new char[13];
	b =s.toCharArray();
	
	String j="";
	for(int i=0;i<b.length;i++) {
		j=j+b[i];
	}
	if(b.length==12) {
	for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+"");
	}
	System.out.println();
	s.trim();
	if(s.startsWith("91")) {
		System.out.println("Valid mobile number");
	}else {
		System.out.println("Not valid/Try again");
	}
	}
	else
	{
		System.out.println("Plz enter valid length");
	}
		}
}
