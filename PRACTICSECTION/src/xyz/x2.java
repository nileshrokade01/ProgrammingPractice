package xyz;
//write a java program to reverse the string word
public class x2 {

	public static void main(String[] args) {
		
		String s="Hello Nilesh Rokade";
		String a[]=s.split(" ");
		System.out.println(a.length+a[2]);
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
			
		}
		
	}
}
