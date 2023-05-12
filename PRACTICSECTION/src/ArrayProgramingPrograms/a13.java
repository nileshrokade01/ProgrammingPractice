package ArrayProgramingPrograms;

public class a13 {
public static void main(String[] args) {
	int a[][]= {{1,2,3},   // 00 01 02
		        {4,5,6},   // 10 11 12
		        {7,8,9}};  // 20 21 22
	int sum=0;
	int i=0;
	for(int j=a.length-1;j>=0;j--)
	{
		 sum=sum+a[i][j];
		 i++;
			
	}
	System.out.println(sum);
	sum=0;
	System.out.println();
	for(int n=0;n<a.length;n++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(n==j)
			{
				sum=sum+a[n][j];
				System.out.print(a[n][j]+" ");
			}
		}
	}
	System.out.println();
	System.out.println(sum);
	
	
	
	
}
}
