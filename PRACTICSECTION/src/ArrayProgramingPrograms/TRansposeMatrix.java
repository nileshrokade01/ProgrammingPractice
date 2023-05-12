package ArrayProgramingPrograms;
//wap to print transpose matrix
public class TRansposeMatrix 
{
	public static void main(String[] args) {
		          //     0   ,      1      ,    2  ,   3
		int [][]a= {{1,2,3,4},{4,5,5,3},{6,7,8,2},{6,7,8,5}};
		         //  0,1,2,3   0,1,2,3,4,5   0,1,2
		System.out.println("ArrayMatrix");
		for(int i=0;i<a.length;i++) //a.length=4
		{
			for(int j=0;j<a[i].length;j++) //a[0].length=4 a[1].length=6
			{
				System.out.print(a[j][i]+" " );
				
				
			}
			System.out.println();
			
		}
	}

}
