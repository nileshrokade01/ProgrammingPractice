package String;

import java.util.Scanner;

public class StartWithMethod {
public static void main(String[] args) {
	//both method return type is boolean format
	Scanner s=new Scanner(System.in);
	String contact=s.next();
	if(contact.startsWith("+91"))
	{
		System.out.println("valid");
	}
	else
	{
		System.out.println("Not valid");
	}
}
}
