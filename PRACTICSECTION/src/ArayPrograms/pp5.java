package ArayPrograms;
//wap to find missing element inside the array
public class pp5 
{
	public static void main(String[] args)
	{
		int sum1=0,sum2=0;
		int a[]= {1,2,5,3,4,6,7,8,9,10,12,14,13,11,16,17}; //After swapping the array is {0,1,2,5,3,4,6,8}
		//sort element of array in ascending order by using selection sort
		for(int i=0;i<a.length;i++)
		{
			int min=i;  //min=0,1,2,3
			for(int j=i+1;j<a.length;j++)
			{     //j=2,3
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			//we doing swapping in below side
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		for(int j=1;j<=a.length+1;j++)
		{
			sum2=sum2+j;
		}
		sum1=sum2-sum1;
		
		System.out.println("The missing number is:"+sum1);
		
	}

}
