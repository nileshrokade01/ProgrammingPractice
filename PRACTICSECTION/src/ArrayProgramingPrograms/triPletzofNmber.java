package ArrayProgramingPrograms;
//wap to find triplet of no
public class triPletzofNmber 
{
	public static void main(String[] args) {
		int []a= {0,-1,2,-3,1};
		int sum=-2;
		int n=a.length;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
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
