package DOMORE;

import java.util.Scanner;
//wap to find factorial of a no 1 to 10
public class p8 {

	public static void main(String[] args)
	{
       
       sheelaTai();
	}
	
	public static void sheelaTai()
	{
	 Scanner sc=new Scanner(System.in);
    System.out.println("enter a number for the factorial output");
    double n=sc.nextInt();
	for( n=n;n<=10.0;n++)
	{
		double fact=1;
	
   for(double i=1;i<=n;i++)
   {
	   
	   fact=fact*i;
   }
   System.out.println(fact);

	}
	sheelaTai();
	}

}
