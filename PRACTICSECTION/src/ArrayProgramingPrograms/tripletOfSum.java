package ArrayProgramingPrograms;
//wap to find triplet of a sum
public class tripletOfSum {

	public static void main(String[] args)
	{
		//if 12+4+9==25 then sum of this no is equal to
		int a[]= {12,3,4,1,6,9};
		int n=a.length;//6
		int sum=25;
		triplet(a,n,sum);
	}
	public static void triplet(int a[],int n,int sum)
	{
		for(int i=0;i<n-3;i++)  //12 3 4 1 
		{
			for(int j=i+1;j<n-2;j++) //12 3 4 1 6
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]+a[k]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}
