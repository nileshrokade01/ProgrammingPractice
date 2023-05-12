package ArrayProgramingPrograms;
//wajp to find sum of the rows and sum of all columns
public class ToFindSUMofallRowsANDcoLumns {
 public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int sumR=0;
	int sumC=0;
	for(int i=0;i<a.length;i++)
	{
		sumR=0;
		sumC=0;
		for(int j=0;j<a[i].length;j++)
		{
			sumR=sumR+a[i][j];
			sumC=sumC+a[j][i];
			
		}
		System.out.println("Sum of all the rows: "+sumR+"  "+"sum of all columns: "+sumC);
		//System.out.println("Sum of all the columns: "+sumC);
	}
}
}
