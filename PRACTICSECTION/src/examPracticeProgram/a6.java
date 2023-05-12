package examPracticeProgram;

import java.util.Arrays;

//write a java program to add elements, to update elements, to delete element, (CRUD)
public class a6 {
	public static int [] delete(int []a,int index,int element)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("IndexOutOfBoundException");
			return a;
		}
		int b[]=new int[a.length-1];
		//b[index]=element;
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
	public static int [] add(int[]a,int index,int element)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("IndexOutOfBoundException");
			return a;
		}
		int b[]=new int [a.length+1];
		b[index]=element;
		for(int i=0;i<a.length;i++)
		{
			if(index>i)
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
	public static int[] update(int []a,int index,int element)
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("IndexOutOfBoundException");
			return a;
		}
		int []b=new int[a.length];
		//b[1]=11
		for(int i=0;i<a.length;i++)
		{
			
				b[i]=a[i];
			
		}
		b[index]=element; 
		return b;
	}
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	System.out.println(Arrays.toString(a));
	int index=3,element=-21;
	a=update(a,index,element);
	System.out.println(Arrays.toString(a));
	index=2;
	element=54;
	a=add(a,index,element);
	element=21;
	index=2;
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
		if(a[i]==element)
		{
			index=i;
		}
	}
	System.out.println();
	a=delete(a,index,element);
	System.out.println(Arrays.toString(a));
			
	
}
}
