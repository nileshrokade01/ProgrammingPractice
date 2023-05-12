package ArayPrograms;
//write a java program to print basic 2d array 
public class twoDaRray 
{
	public static void main(String[] args) {
		
		int a[][]= {{0,1,2},{3,5,7},{8,9,10,11}};
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
//		System.out.println("            "+a[1]);
//		System.out.println("                       "+a[2]);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
