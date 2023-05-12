package DOMORE;
//WAP TO CHECK IF THE NO IS PRIME NO. OR NOT
import java.util.Scanner;
public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
        	if(n%i==0)
        	{
        		count++;
        	}
        	
        }
        if(count==2)
        
        {
        	System.out.println("prime no");
        }
        else 
        {
        	System.out.println("not a prime no.");
        }
        
	}

}
