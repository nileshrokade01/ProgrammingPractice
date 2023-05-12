package ArayPrograms;
//wap to print second largest no inside the array
public class practiceprogram 
{
	public static void main(String[] args) 
	{
		int a[]= {21,31,22,31,23,43};
		int large= Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				slarge=large;
				large=a[i];
			}
			else if(a[i]>slarge && large!=a[i])
			{
				slarge=a[i];
				
			}			
				
		}
		System.out.print(slarge +" "+ large);
		
	}

}
