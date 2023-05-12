package ArrayProgramingPrograms;
//WAP TO PRINT ALL THE ELEMENTS PRESENT INSIDE ARRAY //2D
//transpose
public class twoDarrayprogrAM {
	public static void main(String[] args) {
		int a[][]= {{1,2,4,5},{1,2,0,5},{1,1,5,5},{1,1,5,5}};
		
		for(int i=0;i<a.length;i++)
		{
//			for(int j=0;j<a[i].length;j++)
//			{
//					//System.out.print(a[i][j]+" ");
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println("");
			
			for(int j=0;j<a[i].length;j++)
			{
					//System.out.print(a[i][j]+" ");
				System.out.print(a[j][i]+" ");
			}
			System.out.println("");
			
		}
	}

}
