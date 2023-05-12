package String;
//wap to print to count total no of vowels
public class StringVowels {
public static void main(String[] args) {
	String s="chiken tanduri";
	
	//String res="";
	//s=s.trim();
	int count =0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'  )
		{
			count++;
		}
	}
	System.out.println(count);
}
}
