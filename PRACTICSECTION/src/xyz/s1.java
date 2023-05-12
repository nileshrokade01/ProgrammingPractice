package xyz;
//wap to print count total number of vowels
//vowels " a e i o u "
public class s1 {
public static void main(String[]args) {
	String s = "chiken tanduri";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'  )
		{
			System.out.print(s.charAt(i)+" ");
			count++;
		}
	}
	System.out.println();
	System.out.print(count);
}
}
