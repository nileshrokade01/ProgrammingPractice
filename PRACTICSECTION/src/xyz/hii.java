package xyz;

import java.util.Arrays;

//wap to  sort all the strings in lexographical order /alphabetical order
public class hii {
	public static void main(String[] args) {
	
		String s[]= {"nilesh","nilesh","rokade","pratik","pawar","malik"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(s));
		for(int i=0;i<s.length;i++)
		{
			if(i<s.length-1)
			{
			System.out.print(s[i] + ", ");
			}
			else
			{
				System.out.print(s[i]);
			}
		}
		
		
		
		
		
		
		
		
	}

}
