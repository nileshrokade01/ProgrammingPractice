package String;

import java.util.Arrays;

//wap to count total dupplicate words in the given string
public class duplicatesWords 
{
	
	public static void main(String[] args) {
		String s="java is a used programming programming programming java java language it is used to do programming";
		String[]a=s.split(" ");
		System.out.println();
		System.out.println(Arrays.toString(a));
		int total=0;
		System.out.println();
		//System.out.println(Arrays.toString(a)+a.length);
		//String[] a=s.split(",");                0 1 2 3 4 5 6 7 8 9 10 
		boolean []b=new boolean [a.length];  // b[f,f,f,f,f,f,f,f,f,f,f]
		System.out.println(Arrays.toString(b));
		for(int i=0;i<a.length;i++)
		{
			if(b[i]==false)
			{
				int count =1;
				for(int j=i+1;j<b.length;j++)
				{
					if(a[i].equals(a[j]))
					{
						count++;
					
						b[j]=true;
						
					}
				}
				if(count>1)
				{
					total++;
				}
				
				//System.out.println(count+" ");
			}
			
		}
		System.out.println();
		System.out.println(Arrays.toString(b));
		System.out.println(total);
	}
	

}
