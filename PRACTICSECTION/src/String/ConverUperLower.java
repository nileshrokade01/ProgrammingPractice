package String;
//wap to convert lowercase to upercase
public class ConverUperLower {
	public static void main(String[] args) {
		String s="ThAneE123456";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if (c[i]>='a' && c[i]<='z' )
			{
				c[i]=(char)(c[i]-32);
				//System.out.print(c[i]+" ");
				
			}
		}
		System.out.println(s);
		String s1=new String(c);
		System.out.println(s1);
	}

}
