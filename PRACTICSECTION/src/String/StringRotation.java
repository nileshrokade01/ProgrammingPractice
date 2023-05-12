package String;
//wap to check String is rotated or not
public class StringRotation {
public static void main(String[] args) {
	String s1="ABCD";
	String s2="CDAB";
	s1=s1+s2;
	System.out.println(s1);
	if(s1.indexOf(s2)!=-1)
	{
		System.out.println("Both string are rotating with each other");
	}
	else
	{
		System.out.println("Both are not rotating");
	}
}
}
