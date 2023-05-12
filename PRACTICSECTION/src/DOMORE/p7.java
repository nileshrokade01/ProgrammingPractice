package DOMORE;

import java.util.Scanner;
//wap to find factorial of a no 5 to 10
public class p7 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a starting point of factorial(Initial Number)");
       int n=sc.nextInt();
       System.out.println("Enter the Final point of Factorial(Final Number)");
       int n1=sc.nextInt();
       
       System.out.println();
        if(n<=0)
        {
        	System.out.println("Please change the starting point");
        }
        else
        {
        	if(n1<n)
        	{
        		for(n=n;n>=n1;n--)
        		{
        			int fact=1;
        		
               for(int i=1;i<=n;i++)
               {
            	   
            	   fact=fact*i;
               }
        	   
                  System.out.println("factorial of number : "+n+ " is  : "+fact);

        		}
        	}
        	else
        	{
		for(n=n;n<=n1;n++)
		{
			int fact=1;
		
       for(int i=1;i<=n;i++)
       {
    	   
    	   fact=fact*i;
       }
	   
          System.out.println("factorial of number : "+n+ " is  : "+fact);

		}
        	}
    }
        
		
	}    
	

}
