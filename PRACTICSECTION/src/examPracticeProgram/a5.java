package examPracticeProgram;

import java.util.Arrays;

//wap to delete element inside the array from any index
public class a5 {
	public static int[] delete(int []a,int index,int element)
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("IndexOutOfBoundException");
			return a;
		}
		int b[]=new int[a.length-1];
	    for(int i=0;i<b.length;i++)
	    {
	    	if(index>i)
	    	{
	    		b[i]=a[i];
	    		
	    	}
	    	else
	    	{
	    		b[i]=a[i+1];
	    	}
	    }
	    return b;
	}
public static void main(String[]args)
{
	int index=55,element=370;
	int a[]= {1,2,3,370,4,5};
	 
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==element)
		{
			index=i;
		}
	}
	
	
	a=delete(a,index,element);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	
}
}
