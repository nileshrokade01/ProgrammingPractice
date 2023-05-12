package String;
//wap to convert Lower case to upper String
public class ConverLowerCaseToUpper {
	public static void main(String[] args) {
		String s="nIleshRokaDE";
		//String s1="";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a'&& c[i]<='z')
			{
				c[i]=(char)(c[i]-32);
				//s1=s1+(char)(c[i]-32);
			}
			//System.out.print(c[i]);
		}
		//System.out.println(s1);
		s=new String(c);
		System.out.println(s);
		
		System.out.println(s.charAt('a'-96));
		
	}

}
