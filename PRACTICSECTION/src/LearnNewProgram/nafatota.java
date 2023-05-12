package LearnNewProgram;
//wap to cal original price discount and final price and saving money
import java.util.Scanner;
public class nafatota {
	
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
			
				if(i>=2)
				{
					System.out.println(" ");
					System.out.println("----------------------------------");
					System.out.println("press 1 key for repeat statements");
					System.out.println("----------------------------------");
					int p=sc1.nextInt();
					
					if(p==1)
					{
						bow();
					}
					else
					{
						System.out.println("Wrong Input");
						i=6;
					}
						
				}
				if(i<=5)
				{
				bow();
				}
				
	
		    
		}
	}
	public static void bow()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Price");
		double n=sc.nextDouble();
		//int temp=n;
		System.out.println("Give some Discount");
		double discount=sc.nextDouble();
		double d=100-discount;
		
		
	
		double f=n*d/100;
		double s=n-f;
		
		System.out.println("Your Final Price is : "+f);
		System.out.println(" ");
		System.out.println("You save Rs : "+s);
	}

}
