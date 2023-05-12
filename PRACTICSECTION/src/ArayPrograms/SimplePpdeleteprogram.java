package ArayPrograms;
import java.util.Scanner;
import java.util.Arrays;

//wap to the delete the delete the element inside the array
public class SimplePpdeleteprogram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[] ={1,3,4,5,7,11,13,14,15,17};
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(" ");
		System.out.println("Enter the element which you want to delete.");
		int element=sc.nextInt();
		boolean b=false;
		int search=element;
		int index=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				index=i;
				System.out.println("Deleted Element is : "+a[index]);
				b=true;
				break;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(b==false)
			{
				if(search>a[i] || search<a[i])	
				{
					System.out.println("ElementNotFoundException");
					System.out.println();
					break;
				}
			}
		}
		
	    a=delete(a,index,search);
	    System.out.println(Arrays.toString(a));
		index=6;
		int aelement=111;
		a=add(a,index,aelement);
		System.out.println(Arrays.toString(a));
		
	  
		
	
	}
	public static int[] add(int a[],int index,int aelement)
	{
		for(int i=0;i<a.length;i++)//3 10
		{
			if(index<0 || index>=a.length)
			{
				System.out.println("IndexNotFoundException");
				System.out.println(index);
				return a;
			}
		}
		int b[]=new int[a.length+1];
		                                                    //0,1,2,3,04,05,06,07,08
		System.out.println("length of []a: "+a.length); //9  {1,4,5,7,11,13,14,15,17}
		System.out.println("length of []b: "+b.length); //10
		
		b[index]=aelement;  //10
		for(int i=0;i<a.length;i++) // deleted element is 3 index=1{1,4,5,7,11,13,14,15,17}
		{
			if(i<index)  //index=6
			{
				b[i]=a[i];	
			}
			else 
			{
				b[i+1]=a[i];
			}
		}
		
		return b;
		
	}
	public static int[] delete(int a[],int index,int search)
	{
		boolean k=false;
		
			if(index<0 || index>=a.length)
			{
				System.out.println("IndexIsGreaterException");
				return a;
				
			}
			
			   for(int i=0;i<a.length;i++)
			   {
				   if(search==a[i])
				   {
					   k=true;
					
				   }
			   }
			   if(k==false)
				 {
				   return a;
				 }
			
			
		
		int []b=new int[a.length-1];
		for(int i=0;i<b.length;i++)
		{
			                     //0,1,2,3,4,05,06,07,08,09 
			if(i<index)   //{1,3,4,5,7,11,13,14,15,17}
			{
				b[i]=a[i];
			}
			else if(i>=index)
			{
				b[i]=a[i+1];
			}
		
		}
		return b;
	}
}		
