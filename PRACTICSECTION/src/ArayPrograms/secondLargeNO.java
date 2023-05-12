package ArayPrograms;
//write a program to find second lagrest no
public class secondLargeNO {
	public static void main(String[] args) {
		int []a= {1,2,5,5,24,21,24,24};
		
		int small=Integer.MIN_VALUE;
		int secondsmall= small;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>small)
			{
				
				secondsmall=small;
				small=a[i];		
			}
			else if(a[i]>secondsmall && a[i]!=small)
			{
				secondsmall=a[i];
				
			}
		}
		System.out.println(secondsmall);
		System.out.println("hii");
	}

}
