package ArrayProgramingPrograms;

import java.util.Arrays;

//wap to add element in first position
public class AddElementInFirstp {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		System.out.println(a[1]);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		a=add(9,a);
		System.out.println(Arrays.toString(a));
		a=add(5,a);
		//System.out.println(a);
		System.out.println(Arrays.toString(a));
		a=add(21,a);
		System.out.println(Arrays.toString(a));
		
	}
	public static int[] add(int element,int[]a)
	{
		int []b=new int[a.length+1];
		b[0]=element;
		for(int i=0;i<a.length;i++)
		{
			b[i+1]=a[i];
		}
		return b;
		
	}
}
