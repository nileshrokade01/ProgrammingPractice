package ArrayProgramingPrograms;
//write a java program to print element in ascending order by using bubble sorting
public class a7 {
public  static void  main(String []args)
{
	// BUBBLE SORTING
	int a[]= {6,3,5,1}; // {3,6,5,1} {1,6,5,3} {1,5,6,3} {1,3,6,5} {1,3,5,6}
	
	for(int i=0;i<a.length;i++) // i=1,2,3,4f
	{
		for(int j=i+1;j<a.length;j++) //j=2,3,4 j=2,3,4  j=3,4 j=4
		{
			if(a[i]>a[j])
			{
				int tempu=a[i];
				a[i]=a[j];
				a[j]=tempu;
			}
		}
		System.out.print(a[i]+" ");
	}
}
}
