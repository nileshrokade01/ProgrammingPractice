package xyz;

import java.util.Arrays;

//wap to convert the Lower case string to Upper case String
public class s4 {
public static void main(String[] args) {
	String s="N@il5355esH";
	String res="";
	char c[]=s.toCharArray();
	
	 for(int i=0;i<c.length;i++)
	 {
		 if(c[i]>='a' && c[i]<='z')
		 {
			res=res+(char)(c[i]-32);
		 }
		 else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		 {
			 res=res+c[i];
		 }
		
	 }
	System.out.println(res);
	System.out.println(res.charAt(3));
	
}
}
