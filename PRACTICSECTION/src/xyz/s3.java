package xyz;
//wap to reverse the string
public class s3 {
public static void main(String[] args) {
	String s="Nilesh Rokade";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	String s1="";
	for(int i=rev.length()-1;i>=0;i--)
	{
		s1=s1+rev.charAt(i);
	}
	System.out.println(s1);
			
}
}
