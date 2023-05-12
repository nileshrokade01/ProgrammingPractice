package ArayPrograms;
//wap to find smallest element in Array
public class SmallstElementInArray {
public static void main(String[]args) {
	
	int large=Integer.MAX_VALUE;
	int a[]= {1,1,1,1,1,1,1,1,};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<large)
		{
			large=a[i];
		}
	}
	System.out.println(large);
}
}
