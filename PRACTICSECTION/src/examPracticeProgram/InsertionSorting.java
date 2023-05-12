package examPracticeProgram;

import java.util.Arrays;

//wap to sort the elements in ascending order by using insertion sorting technique
public class InsertionSorting {
public static void main(String[] args) {
	//insertion we assume 1st index is small than others then we select that index and compere the elements with 0th index if 0rth 
	// index is greater/bigger then swapping happens with each other
	int a[]= {25,21,4,6,9};
	
	System.out.println(Arrays.toString(a));
	
	for(int i=1;i<a.length;i++)
	{
		int temp=a[i];
		int j=i;
		while(j>0 && a[j-1]>temp)
		{
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
		
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	int b[]= {25,21,4,6,9};
	System.out.println();
	for(int i=0;i<b.length;i++)
	{
		
		for(int j=i+1;j<b.length;j++)
		{
			int tempu=b[i];
			  if(b[i]>b[j])
			  {
			b[i]=b[j];
			b[j]=tempu;
			  }
		}
		System.out.print(b[i]+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
