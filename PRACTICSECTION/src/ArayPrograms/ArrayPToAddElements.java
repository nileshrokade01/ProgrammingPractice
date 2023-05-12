package ArayPrograms;

import java.util.Arrays;

//wap to add new element inside array in last position
public class ArrayPToAddElements 
{
	public static int[] add(int element,int[]a)
	{
		int []b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		b[3]=element;
		return b;
	}
	
	public static void main(String[] args) 
	{
		
		int[]a= {1,2,3,4,5};
		a[1]=11;
		
		a=add(10,a);
		System.out.println(Arrays.toString(a));
		
	}
	
	
//	public static int[] add(int element,int[]a)
//	{
//		int[] b=new int[a.length+1];
//		b[a.length]=element;
//		for(int i=0;i<a.length;i++)
//		{
//			b[i]=a[i];
//		}
//		return b;
//	}

}
