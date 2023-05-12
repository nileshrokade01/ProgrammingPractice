package examPracticeProgram;
//wap to find largest element inside the array
import java.util.Arrays;
public class a10 {
public static void main(String[]args) {
	int a[]= {-1,-12,-1,-41,-11,3};
	int large=Integer.MIN_VALUE;
	int large1=Integer.MIN_VALUE;
	System.out.println(large+" "+large1);
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>large)
		{
			large1=large;
			large=a[i];  //large=-1
		}
		else if(a[i]>large1 && large!=a[i])
		{
			large1=a[i]; //large1=-12,-11,-3
		}
	}
	System.out.println("largest Element is : "+large);
	System.out.println("Second Largest Element is : "+large1);
	
	
	
	//binary search
	
	int a1[]= {6,6,2,45,34,5};
	// step 1 = first sort the array element in ascending order, I used insertion sort method/technique
	 
	for(int i=1;i<a1.length;i++)  //2,6,6,45,34,5  3,6,6,45,34,5  2,3,6,45,34,5
	{
		int j=i; //j=1
		int temp=a1[i]; //temp = 1
		while(j>0 && a1[j-1]>temp)
		{
			a1[j]=a1[j-1];
			j=j-1;  //j=1,0
		}
		a1[j]=temp;
	}
	
	int search=34,sp=0,ep=a1.length-1,mp=(sp+ep)/2;
	
	while(sp<=ep)
	{
		if(a1[mp]==search)
		{
			System.out.println("the element found in index : "+mp);
			break;
		}
		else  if(search>a1[mp])
		{
			sp=mp+1;
		}
		else if(search<a1[mp])
		{
			ep=mp-1;
		}
		mp=(sp+ep)/2;
	}
	if(sp>ep)
	{
		System.out.println("the element is not present in this array");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	
}
}
