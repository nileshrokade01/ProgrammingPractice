package MatrixArray;
//wajp to add 2 multi-dimention arrays
public class Add2arrays 
{
	public static void main(String[] args) 
	{
		int [][]a= {{0,1,2},{3,4,7},{6,7,8}};
		int [][]b= {{0,1,4},{4,4,5},{2,2,8}};
		
		for(int i1=0;i1<a.length;i1++)
		{
			for(int j1=0;j1<a[i1].length;j1++)
			{
				for(int i=0;i<b.length;i++)
				{
					for(int j=0;j<b[i].length;j++)
					{
						i1=i;
						j1=j;
						a[i][j]=a[i1][j1]+b[i][j];
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
			}
		}
		
	}

}
