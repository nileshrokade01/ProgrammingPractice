package xyz;
//wap to remove 1st and print remove last char and print
public class a6 {
public static void main(String[] args) {
	String s="combination";  
	       // 01234567891011
	System.out.println(s);
	int i=0;
	while(1!=s.length())
	{
		if(i%2==0)
		{
		   s=s.substring(1);
		   
		}
		else {
			s=s.substring(0,s.length()-1);
			//System.out.println(s);
		}
		System.out.println(s);
		i++;
	}
}
}
