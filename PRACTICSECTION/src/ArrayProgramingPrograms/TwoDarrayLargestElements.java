package ArrayProgramingPrograms;
//wajp to display largest element
public class TwoDarrayLargestElements {
public static void main(String[] args) {
	int [][]a= {{1,8,7},{9,6,5},{3,8,4}};
	int large=Integer.MIN_VALUE;
	int row=0;
	for(int i=0;i<a.length;i++)
	{
		large=Integer.MIN_VALUE;
		for(int j=0;j<a[i].length;j++)
		{
			
			if(a[i][j]>large)
			{
				large=a[i][j];
				
			}
			//System.out.println(a[i][j]);
		}
		System.out.println(large);
	}
}
}
