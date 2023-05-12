package examPracticeProgram;

import java.util.Arrays;

//write a program to add new element inside array in first or middle index 
public class a4 {
	public static int[] add(int index,int element,int []a)
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("ArrayIndexOutOfBoundException");
			return a;
		}
		int []b=new int [a.length+1];
		b[index]=element;
		for(int i=0;i<a.length;i++)
		{
			if(index>i)  //in=3  3<0,1,2
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
public static void main(String[] args) {
	int a[]= {1,2,43,43,3,5};
	System.out.println(Arrays.toString(a));
	int index=30,element=55;
	a=add(index,element,a);
	System.out.println(Arrays.toString(a));
	
	
}
}
