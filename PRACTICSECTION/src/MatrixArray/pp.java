package MatrixArray;

public class pp {

	public static void main(String[] args) {
		
		int [][]a= {{1,2,3,5},    // 00 01 02
				    {4,5,6,5},    // 10 11 12
				    {7,8,9,4},
				    {7,0,9,1}};   // 20 21 22
		
		
		int [][]b= {{1,2,1,4},   // 00 01 02
				    {4,5,4,7},   // 10 11 12
				    {7,8,9,1},
				    {7,8,9,1}};  // 20 21 22
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				sum=0;
				for(int k=0;k<b[i].length;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
		
	}
}
