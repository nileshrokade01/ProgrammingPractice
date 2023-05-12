package ArrayProgramingPrograms;

public class AllElementsOfArray 
{
	public static void main(String[] args) {
		int a[]= {10,20,30,50};
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
			}
		System.out.println();
		
		System.out.println("==========While loop==============");
		
		int n=0;
		while(n<a.length)
		{
			System.out.print(a[n]+" ");
			n++;
		}
		System.out.println();
		System.out.println("==========Do while loop==============");
		
		int j=0;
		do
		{
			System.out.print(a[j]+" ");
			j++;
		}
		while(j<a.length);
		System.out.println();
		System.out.println("==========For each loop==============");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
}
