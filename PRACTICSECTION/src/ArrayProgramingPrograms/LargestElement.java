package ArrayProgramingPrograms;
//wap to find larges element inside the array
public class LargestElement {
public static void main(String[] args) {
	 
	int []a= {1,2,3,4,-55,7,7,4,10};
	int small=Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(small<a[i])
		{
			small=a[i];
		}
		
	}
	System.out.println(small);
}
}
