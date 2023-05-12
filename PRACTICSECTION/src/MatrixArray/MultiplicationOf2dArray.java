package MatrixArray;
//wajp to multiply 2 multidimention arrays
public class MultiplicationOf2dArray 
{
	public static void main(String[] args)
	{
		int [][]a={{1,2,3},{4,5,6},{7,8,9}};
		int [][]b={{1,2,1},{1,3,1},{0,1,1}};
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int i1=0;i1<b.length;i1++)
				{
					int sum=0;
					k=0;
					for(int j1=0;j1<b[i1].length;j1++)
					{
						i=i1;
						j=j1;
						
						
						System.out.print("");
						
						sum=sum+ a[i][j]+b[j1][i1] +a[i][j]*b[j1][i1];
						
						System.out.print(sum+" ");
						//System.out.print(a[i][j]+ " | ");
					}
					System.out.println();
				}
			}
		}
		
	}

}
