package String;

import java.util.Scanner;

public class EndWithMethod {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Your mail id here : ");
	String email=s.next();
	if (email.endsWith("@jspider.com")) {
		System.out.println("valid");
		
	} else {
		System.out.println("not valid");

	}
}
}
