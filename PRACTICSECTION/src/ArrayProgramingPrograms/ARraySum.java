package ArrayProgramingPrograms;
//wajp to find sum of each row
public class ARraySum {
 public static void main(String[] args) {
	int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
	
	int sumRow1=0;
	int sumRow3=0;
	for(int i=0;i<a.length;i++)
	{   sumRow1=0;
		for(int j=0;j<a[i].length;j++)
		{
			//System.out.println(a[i][j]);
			
			sumRow1=sumRow1+a[i][j];
			
		}
		System.out.println(sumRow1);
		
	}
	
}
}
