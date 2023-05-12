package ArayPrograms;
//wap to sort elements in ascending order by using of bubble sort technique
import java.util.Arrays;
public class pp2 
{
	public static void main(String[] args) {
		int a[]= {2,11,23,22,45,13,-121};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------");
		
		System.out.println(" ");
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{//swapping no without using of third variable
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
	}

}
