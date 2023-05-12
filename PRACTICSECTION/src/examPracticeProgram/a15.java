package examPracticeProgram;
//wap to find triplet of sum
public class a15 {
public static void main(String[]args)
{
	int n=25;
	int a[]= {12,3,4,1,6,9};
	boolean b=false;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(a[i]+a[j]+a[k]==n)
				{
					b=true;
					System.out.println("The Trplet of sum is : "+a[i]+" "+a[j]+" "+a[k]);
					
				} 
				if(a[i]-a[j]+a[k]==n)
				{
					b=true;
					System.out.println("The Trplet of sum is : "+a[i]+" "+a[j]+" "+a[k]);
					
				}
				if(a[i]+a[j]-a[k]==n)
				{
					b=true;
					System.out.println("The Trplet of sum is : "+a[i]+" "+a[j]+" "+a[k]);
					
				}
				
			}
		}
	}
	if(b==false)
	{
		System.out.println("the element are not form any triplet form");
		
	}
}
}
