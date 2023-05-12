package ArrayProgramingPrograms;
//wap to to search elements in a array
public class LinearSearch {
	public static void main(String[] args) 
	{
		int[] a= {7,6,8,1,5};
		int search=8;
		boolean b=false;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("the element is present at index : "+i);
				b=true;
				break;
			}
			
		}
		
		if(b==false)
		{
			System.out.println("not present");
		}
	}

}
