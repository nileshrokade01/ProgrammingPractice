package ArrayProgramingPrograms;
//wajp to find sum of diagonal digits
public class DaygonalSumArray 
{
	public static void main(String[] args)
	{              //0 1 2
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
				
				sum=sum+a[i][j];
				
				}
				
				
			}
		}
		System.out.println(sum);
	
		
	}
	

}
