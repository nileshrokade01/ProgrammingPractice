package xyz;
//wap to display smallest length string
public class SmallestLengthString {
public static void main(String[] args) {
	String a[]= {"nilesh","rokadesd","shona","abcd","ok","sun"};
	
	String temp=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(temp.length()<a[i].length())
		{
			temp=a[i];
		}
		
		
	
	}
	System.out.println(temp);
	}
}
