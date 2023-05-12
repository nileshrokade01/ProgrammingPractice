package ArrayProgramingPrograms;

import java.util.Arrays;

//wajp to sort your name character in ascending order by using bubble sort
public class a8 {
public static void main(String[]args)
 {
	char a[]= {'N','I','L','E','S','H'};
	System.out.println(Arrays.toString(a));
   
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				char tempu=a[i];
				a[i]=a[j];
				a[j]=tempu;
			}
			
		}
		System.out.print(a[i]+" ");
	}
 }
}
