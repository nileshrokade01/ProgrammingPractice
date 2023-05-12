package ArayPrograms;

import java.util.Arrays;

//wap to search element by using linear search
public class searchElement {
	public static void main(String[] args) {
		int []a= {2,21,31,11,2,12,31,1,24};
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
		int search=31;
		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("the no is found in index:"+i);
				b=true;	
			}
			
		}
		if(b==false)
		{
			System.out.println("inex not found");
		}
	
	}

}
