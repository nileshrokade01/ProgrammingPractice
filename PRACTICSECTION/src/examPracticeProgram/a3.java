package examPracticeProgram;

import java.util.Arrays;

//wap to add element in the last position of array
public class a3 {
	public static int [] add(int e,int []a)
	{
		int []b=new int[a.length+1];
		b[a.length]=e;
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		return b;
	}
public static void main(String[] args) {
	int a[]= {1,2,3,4,6,4};
	System.out.println(Arrays.toString(a));
	int element=25;
	
	a=add(element,a);
	System.out.println(Arrays.toString(a));
}
}
