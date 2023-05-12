package ArrayProgramingPrograms;
//wap to print transpose of matrix
public class a12 {
public static void main(String[] args) {
	
	int a[][]= {{1,2,3},   // 00 01 02
			    {4,5,6},   // 10 11 12
			    {7,8,9}};  // 20 21 22
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
	}
}
}
