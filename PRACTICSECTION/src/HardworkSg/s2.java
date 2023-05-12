package HardworkSg;

import java.util.Arrays;

// Write a program to check the given string is Anagram or not
public class s2 {
public static void main(String[] args) {
	String s1 = "ATC.";
	String s2 = "CAT";
	//Step 1 = Sort the both String s1 and s2
	char [] c = s1.toCharArray();
	char [] a = s2.toCharArray();
	for(int i = 0 ; i<c.length;i++) {
		char temp = c[i];
		for(int j=i+1; j<c.length;j++) {
			if(c[i]>c[j]) {
				c[i]=c[j];
				c[j]=temp;
			}
		}
		
	}
	for(int i =0 ; i<a.length;i++) {
		char temp=a[i];
		for(int j =i+1;j<a.length;j++)
		{
			if(a[i]>a[j]) {
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	s1=new String(c);
	s2=new String(a);
	if(s1.length()==s2.length()) {
		
		if(s1.equals(s2)) {
			System.out.println("the given string is anagram");
			
		}
		else
		{
			System.out.println("Not an Angram");
		}
	}
	else {
		System.out.println("Not an Anagram1");
	}
	
	
}
}
