package String;
//wap to display the smallest length string 
public class SmallestLengthString {
	public static void main(String[] args) {
		
		String []s= {"hiiiiiiii","byee","ki","fhhefu"};
		int a=s.length;
		System.out.println(a);
		String temp=s[0];  //
		for(int i=1;i<s.length;i++)
		{
			if(temp.length()>s[i].length())
			{
				temp=s[i];
			}
		}
		System.out.println(temp);
			
		
		
		
	}

}
