package ArrayProgramingPrograms;
//wap to find second largest element
public class SecondLargesElement {

	public static void main(String[] args) {
		int a[]= {14,3,11,15,2,14,2};
		int large=Integer.MIN_VALUE;
		int slarge=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				slarge=large;
				large=a[i];
				
			}
			else if(a[i]>slarge && a[i]!=large)
			{
				slarge=a[i];
			}
			
			
		}
		System.out.println(large);
		System.out.println(slarge);
	}
}
