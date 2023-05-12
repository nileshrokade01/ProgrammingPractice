package examPracticeProgram;
import java.util.Arrays;
//wap to print user input elements
import java.util.Scanner;
public class userInput {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int []a= {1,2,3,4,5,6};
	int []b=new int[n];
	for(int i=0;i<b.length;i++)
	{
		System.out.println("Enter the Elements Of Array");
		b[i]=sc.nextInt();
	}
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
	System.out.println();
	System.out.println(Arrays.toString(b));
	
}
}
