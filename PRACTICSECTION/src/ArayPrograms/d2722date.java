package ArayPrograms;
import java.util.Arrays;
//wap to add element in any position 
import java.util.Scanner;
public class d2722date 
{
	public static int[] add(int element,int []a,int index)
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("IndextNotFound");
			return a;
		}
		int []b=new int[a.length+1];
		
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
  			{
  			   b[i]=a[i];
  			   
  					   
  			}
			else
			{
				b[i+1]=a[i];
			}
             
		}
		b[index]=element;
		return b;
		
				
	}
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		int[]a= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(a));
		
		System.out.println(" ");
		
		System.out.println("Enter the Element to add inside the array");
		int element=sc.nextInt();
		System.out.println("Enter the index no to add element there");
		int index=sc.nextInt();
		
		a=add(element,a,index);
		System.out.println(Arrays.toString(a));
		
		
	}

}
