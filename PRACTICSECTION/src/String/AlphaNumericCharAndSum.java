package String;
//wap to print char size, character in same range and sum of their numbers
public class AlphaNumericCharAndSum 
{
	public static String count(String s)
	{
		int count=0;
		String res="";
	    for(int i=0;i<s.length();i++)
	    {
	    	//s="1BAN2G3ALO4RE";
	    	if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	    	{
	    		count++;
	    		res=res+s.charAt(i);
	    		
	    	}
	    }
	    return count+res;
	}
	public static void main(String[] args) {
		String s="1BAN2G3ALO9RE";
		System.out.print(count(s)+sum(s));
		//System.out.println(sum(s));
		//System.out.println('0'+0);
	}
	public static int sum(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+s.charAt(i)-48;
				//sum=sum+Integer.parseInt(s, s.charAt(i));
			}
		}
		return sum;
	}

}














