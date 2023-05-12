package ArayPrograms;
import java.util.Scanner;
//wap to add user input element inside the array
//step1 create scanner class but before that you have to import the scanner class
public class pp {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		char a[]=new char[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the elment of the array");
			a[i]=sc.next().charAt(0);
			
		}
		System.out.println("-----------------------------------");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		
		
	}

}
































