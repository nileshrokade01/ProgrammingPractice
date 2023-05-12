package hOMEPRO;
//write a program to calculate total number vowels present inside string
//vowla = a e i o u
public class TotleVowels {
	public static void main(String[] args) {
		
		String a="nilesh";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' || a.charAt(i)=='e')
			{
				//System.out.print("vowels : "+a.charAt(i)+" ");
				count++;
			}
			else if(a.charAt(i)!='a' && a.charAt(i)!='i' && a.charAt(i)!='o'&& a.charAt(i)!='u' && a.charAt(i)!='e')
			{
				//System.out.print("consonants : "+a.charAt(i)+" ");
			}
		}
		System.out.println(count);
	}

}
