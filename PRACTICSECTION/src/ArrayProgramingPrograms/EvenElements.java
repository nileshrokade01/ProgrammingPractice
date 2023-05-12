package ArrayProgramingPrograms;
//wap all the even elements from the array
public class EvenElements 
{
   public static void main(String[] args) {
	int[] a= {1,82,360,41,5,6};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
}
}
