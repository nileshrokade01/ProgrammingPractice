package String;

import java.util.Arrays;

//wap to print 1st duplicate character in the given string     

public class FirstDuplicatechar {
	public static void main(String[] args) {
		String s="calculate";
		
		char[]c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		boolean []b=new boolean[c.length];
		for(int i=0;i<c.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]==c[j])
					{
						count++;
						b[j]=true; //j=3,
						
					}
				}
				if(count>1)
				{
					System.out.println(c[i]+" ");
					break;
				}
			}
		}
				
	}

}
