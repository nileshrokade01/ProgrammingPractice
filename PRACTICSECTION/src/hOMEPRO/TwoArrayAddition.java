package hOMEPRO;

public class TwoArrayAddition
{
	public static void main(String[] args) 
	{
		
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b= {{7,2,3},{4,8,6},{7,8,10}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int i1=0;i1<b.length;i1++)
				{
					i=i1;
					
					for(int j1=0;j1<b[i1].length;j1++)
					{
						j=j1;
						
							a[i][j]=a[i][j]+b[i1][j1];
				              
							System.out.print(a[i][j]+" ");
							
						
					}
					
				
					System.out.println();
					
				}
			}
		
			
		}
	}


}
