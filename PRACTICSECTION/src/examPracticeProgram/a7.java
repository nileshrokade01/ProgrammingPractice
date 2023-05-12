package examPracticeProgram;

import java.util.Arrays;

//wap to arrange the number in ascending order by using of selection sort
public class a7 {
	
public static void main(String []args)
{
	int []a= {2,43,22,32,2,4,32,33,22};
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<a.length;i++)
	{
		int min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		int tempu=a[i];
		a[i]=a[min];
		a[min]=tempu;
	}
	
	System.out.print(Arrays.toString(a));
	
	
	
	
	
	
	
	
	
	
	
	


}
}
