package xyz;

import java.util.Arrays;

//All the important method of String class
public class AllStringCLassMethod {
public static void main(String[] args) {
	String s=" Nil esh Rok ade  ";
	String s1="nileshrOkade";
//	String s=new String ("NileshRokade");
//	String s1=new String ("NileshRokade");
	System.out.println(s==s1);
	
	// charAt(int index) - return type is character
	// this method is used to return the character present at given index
	
	System.out.println(s.charAt(5));
	
	// length() - return type is int 
	// this method is used to return the no. of characters in current string.
	System.out.println(s.length());
	
	
	// trim() : return type is String 
	// this method is used to remove the unwanted space from the start and end of the string
	s=s.trim();
	System.out.println(s.trim());
	
	// equals(String str) - return type is boolean.
	// this method is used to compare the data present inside the object.
	// this method is case sensitive.
	System.out.println(s.equals(s1));
	
	// equalsIngnoreCase(String str) - return type is String.
	// this method is used to compare the data present inside the object
	// this method is case insensitive.
	System.out.println(s.equalsIgnoreCase(s1));
	
	// toCharArray() : return type is char[]
	// this method is used to convert the String into char[]
	
	char [] c=s1.toCharArray();
	System.out.println(Arrays.toString(c));
	System.out.println("["+c[4]+", "+c[1]+", "+c[2]+", "+c[3]+"]");
	
	
	// split(String str) : return type is String[].
	// this method is used to split the string base on the specified string.
	String []h=s.split(" ");
	System.out.println(Arrays.toString(h));
	System.out.println("["+h[0]+", "+h[1]+", "+h[2]+", "+h[3]+"]");
	
	
	// toUpperCase() and toLoweCase() : return type is string
	// this method is used to convert lowercase into upper case string or viceveresa.
	String str=s1.toUpperCase();
	System.out.println(str);
	
	String str1=str.toLowerCase();
	System.out.println(str1);
	
	// replace(char old,char new) : return type is string.
	// this method is used to replace all occurence of old string into new string
	str1=str1.replace("nilesh", "sonusheth");
	
	System.out.println(str1);
	
	// indexOf(char ch) : return type is int
	// this method is used to find the index of specified character.
	int a=str1.indexOf('u');
	System.out.println(a);
	
	
	
	
}
}
