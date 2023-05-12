package ArayPrograms;
//wap to search element by using binary search 
public class pp4 {
public static void main(String []args)
	{
		
	int a[]= {2,11,32,44,65,112,122,123,145};
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
		System.out.println(" ");
	
	
		int search=145;
		int sp=0;int ep=a.length-1;
		int mp=(sp+ep)/2;
		
			while(sp<=ep)
		  {
			if(search==a[mp])
			{
				System.out.println("Elements found at index:"+mp);
				break;
			}
			else if(search>a[mp])
			{
				sp=mp+1;
			}
			else if(search<a[mp])
			{
				ep=mp-1;
			}
			
			mp=(sp+ep)/2;
		  }
			
			
			
	 
		if(sp>ep)
		{
			System.out.println("Element is not found");
		}
		
		
   }
}
