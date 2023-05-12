package String;
//MUR69BA60D
//PLANNING (numbers length*char length) + char+(number -char length)
//output : 24MURBAD2
public class Murbad
{
	public static String count(String s)
	{
		String sum="";
		int count =0,count1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
				sum=sum+s.charAt(i);	
				
			}
			else
			{
				count1++;
			}
		}
		count=count-count1;
		return sum+count;
	}
	public static void main(String[] args) {
		String s="MUR69BA60D";
		System.out.print(total(s));
		System.out.println(count(s));
		
		
		
	}
	public static int total(String s)
	{
		int count1=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				count1++;
				
				
			}
			else
			{
				count++;
			}
		}
		
		return count1*count;
	}

}
