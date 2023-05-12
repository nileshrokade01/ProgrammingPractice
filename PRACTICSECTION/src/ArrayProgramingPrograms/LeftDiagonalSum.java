package ArrayProgramingPrograms;
//wajp to find sum of left matrix
public class LeftDiagonalSum 
{
	public static void main(String[] args) {
		int a[][]= {{1,2,3,15},{4,5,6,5},{7,8,9,4},{4,5,6,15}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				 if(i+j==a.length-1)
				 {
					sum=sum+a[i][j];
				 }
				 
			}
		}
		System.out.println(sum);
		
	}
	

}
