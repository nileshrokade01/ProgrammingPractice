package String;
//wajp to reverse the string


//Note : for array we use length var  |
//       for collect we use get()     | To access the variable we used
//       for string we use length()   |
public class REVString 
{
	public static void main(String[] args) {
		
		String s="nilesh rokade";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
