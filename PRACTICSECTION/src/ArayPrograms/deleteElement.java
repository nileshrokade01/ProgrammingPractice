package ArayPrograms;

import java.util.Arrays;

//wap to delete the element inside the array 
public class deleteElement {

	public static int[] delete(int[]a,int index)
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("Index Not Found");
			return a;
		}
		int b[]=new int[a.length-1];
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
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		int index=60;
		a=delete(a,index);
		System.out.println(Arrays.toString(a));
		
		
	}
}
