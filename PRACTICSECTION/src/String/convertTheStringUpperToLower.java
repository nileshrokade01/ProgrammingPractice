package String;

import java.util.Arrays;

//wap to convert the string upercase to lower
public class convertTheStringUpperToLower {
public static void main(String[] args) 
{
	String str="roKa45DE NILESH";
	
	char[]c=str.toCharArray();
//	char []c1= {'v',' ','d'};
//	int []a= {1,2,3};
//	System.out.println(c);
	System.out.println(Arrays.toString(c));
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>='A'  && c[i]<='Z')
		{
			c[i]= (char)(c[i]+32);   //we doing narrowing here
			//System.out.print(c+" ");
			
		}
	}
	System.out.println(c);
	
	str=new String(c);
	System.out.println(str);
	
}
}

//Data-type	          Size	        Maximum Value
//Character ( char)	    1	          127
//Unsigned Character	1	          255
//Short Integer( short) 2	          32767
//Unsigned Short Int	2	          65535














