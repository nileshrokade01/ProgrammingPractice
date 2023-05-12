package xyz;
//wap to swapp two string
public class s2 {
public static void main(String[] args) {
	String a="nandkumar"; //9
	String b="ashwina";   //7
	System.out.println("Before Swapping");
	System.out.println("a : "+a);
	System.out.println("b : "+b);
	
	System.out.println();
	
	//Concatenate both the variables
	a=a.concat(b);  // a=nandkumarashwina  16
	//a=a+b;
	
	b=a.substring(0,a.length()-b.length());  //16-7=9  0,9
	a=a.substring(b.length());
	
	System.out.println("After Swapping");
	System.out.println("a : "+a);
	System.out.println("b : "+b);
}
}
