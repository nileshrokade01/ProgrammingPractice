package ArrayProgramingPrograms;
import java.util.Arrays;
import java.util.Scanner;
//wap to print even elements from the array
public class tempPractice {
	
	public static void main(String[] args) {
		
	
//	int []a= {1,2,1,221,32,45,53,3,5,6,66};
//	  for(int i=0;i<a.length;i++)  //11
//	  {
//		  if(a[i]%2==0)
//			{
//				System.out.println(a[i]);
////				System.out.println(a.length);
//				
//			}
//	  }
//	  
//	  //WAP TO PRINT USER INPUT
//	  
//	  Scanner sc=new Scanner(System.in);
//	  System.out.println("Enter the size of the array");
//	  int n=sc.nextInt();
//	  int []a1=new int[n];  //size obtain here
//	  for(int i=0;i<a1.length;i++) //array index start from 0
//	  {
//		  System.out.println("Enter the Elements of the array");
//		  a1[i]=sc.nextInt();  //i indicates the index
//	  }
//	  for(int j=0;j<a1.length;j++)
//	  {
//		  System.out.println(a1[j]);
//	  }
//	  wap ro print element present inside or not
		
		
//		int a[]= {1,33,4,56,3,7,5,3,5,4};
//		boolean b=false;
//		int search=31;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(search==a[i])
//			{
//				b=true;
//				System.out.println("The elements is presents inside array");
//				break;
//			}
//		}
//		if(b==false)
//		{
//			System.out.println("Element is not present inside array");
//		}
//	  
//		
//		//wap to sort yourname
//		
//	 char[] n= {'n','i','l','e','s','h'} ;
//		for(int i=0;i<n.length;i++)
//		{
//			for(int j=i+1;j<n.length;j++)
//			{
//				if(n[i]>n[j])
//				{
//					char temp=n[i];
//					n[i]=n[j];
//					n[j]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<n.length;i++)
//		{
//			System.out.print(n[i]+" ");
//		}
//		


  //wap to add new element in first position
		
		int []a= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		a=add(6,a);
		System.out.println(Arrays.toString(a));
		
		
		
		
	}
		
		public static int[] add(int element,int[]a)
		{
			int []b=new int[a.length+1];  //size
			b[0]=element;
			for(int i=0;i<a.length;i++)
			{
				b[i+1]=a[i];
			}
			return b;
		}
	 
}
