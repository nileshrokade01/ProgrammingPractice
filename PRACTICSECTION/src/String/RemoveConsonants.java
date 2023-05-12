package String;
//wap to remove the consonants of the string
public class RemoveConsonants {

	public static void main(String[] args) {
		String s="bhelpuri";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' )
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
		
	
	}
}
