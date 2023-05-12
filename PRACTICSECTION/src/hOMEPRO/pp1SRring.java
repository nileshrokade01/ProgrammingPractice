package hOMEPRO;
//wajp to reverse the string
public class pp1SRring 
{
	public static void main(String[] args) {
		String s="DRAMAN";
		String s0="draman";
		System.out.println(s==s0);
		String s1="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i=i-1)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		String sc="Nilesh";
		
		String p=sc.concat(" Rokade");
		System.out.println(p);
		buffer();
		
	}
	public static void buffer()
	{
		StringBuffer s=new StringBuffer("sonuMonu"+"-");
		s.append("rokade");
		System.out.println(s);
		String sc=new String("nil");
		String sc1=new String("Nil");
		System.out.println(sc.equalsIgnoreCase(sc1));
		System.out.println(sc==sc1);
	}

}
