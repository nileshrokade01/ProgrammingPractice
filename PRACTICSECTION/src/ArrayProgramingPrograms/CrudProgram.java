package ArrayProgramingPrograms;

import java.util.Arrays;

//homework
public class CrudProgram
{
	public static void main(String[] args) 
	{
		int []a= {21,22,23,24,25};
		System.out.println("Creation of Array");
		System.out.println("a : "+Arrays.toString(a));
		System.out.println("");
		int index=2;
		int element=31;
		a=update(index,element,a);
		System.out.println("update");
		
		System.out.println("a : "+Arrays.toString(a));
	    index=4;
	    element=111;
	    System.out.println("");
	    System.out.println("addition");
	    
	    a=add(index,element,a);
	    System.out.println("a : "+Arrays.toString(a));
	    index=1;
	    a=delete(a,index);
	    System.out.println("");
	    System.out.println("deletion");
	    
	    System.out.println("a : "+Arrays.toString(a));
		
		
	}
	public static int [] delete(int[]a,int index)
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("Index not Found");
			return a;
		}
		int []b=new int[a.length-1];
		
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
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
	
	public static int[] add(int index,int element,int[]a)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("Index Not Found");
			return a;
		}
		int []b=new int[a.length+1];
		b[index]=element;
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
					
			}
			else
			{
				b[i+1]=a[i];
						
			}
		}
		return b;
	}

	
	public static int[] update(int index,int element,int[]a)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("Index Not Found");
			return a;
		}
		int[]b=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i]=a[i];
				
			}
		}
		b[index]=element;
		return b;
		
	}
	
}
