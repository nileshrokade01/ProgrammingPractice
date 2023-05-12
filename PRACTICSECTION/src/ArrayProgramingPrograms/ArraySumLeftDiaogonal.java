package ArrayProgramingPrograms;
//wap to find sum of diagonal of matrix
public class ArraySumLeftDiaogonal 
{
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		for(int i=0;i<=0;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i+j][j+i];
			}
		}
		System.out.println("the sum of right diagonal is: "+sum);
		
		System.out.println("-------------------------------------");
		
		for(int i=0;i<=0;i++)
		{
			sum=0;
			for(int j=a.length-1;j>=0;j--)
			{
				sum=sum+a[i][j];
				i++;
			}
		}
		System.out.println("the sum of left diagonal :"+sum);
		
	}

}
