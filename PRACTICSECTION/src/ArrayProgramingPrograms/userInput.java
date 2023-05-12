package ArrayProgramingPrograms;
//wap to print user input elements
import java.util.Scanner;

public class userInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of the Array");
	int n=sc.nextInt();
	int[] a=new int[n];
//	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter the elements of the array");
		a[i]=sc.nextInt();
		
	}
	System.out.println("=========================================");
	for(int i=0;i<a.length;i++)
	{
		//System.out.println(a[i]);
		System.out.print(a[i]+" ");
	}
}
}