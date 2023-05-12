package DOMORE;
//WAP TO FIND ALL THE FACTORS OF A NUMBER....?
import java.util.Scanner;
public class p10 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER A NO");
		int n=s.nextInt();
		System.out.println("factors:"+n);
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		

	}

}
