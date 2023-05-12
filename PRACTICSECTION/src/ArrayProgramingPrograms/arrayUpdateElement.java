package ArrayProgramingPrograms;

import java.util.Arrays;

//wap to update the elements
public class arrayUpdateElement {
public static void main(String[] args) {
	int []a= {1,2,3,4};
	System.out.println(Arrays.toString(a));
	System.out.println("");
	int index=2;
	int element=14;
	a=update(index,element,a);
	System.out.println(Arrays.toString(a));
	System.out.println("");

	 index=4;
	 element=15;
	 a=update(index,element,a);
	 System.out.println(Arrays.toString(a));
}
public static int[] update(int index,int element,int[]a)
{
	if(index<0 || index>=a.length)
	{
		System.out.println("index not found");
		System.out.println("");

		return a;
	}
	a[index]=element;
	return a;
}
}
