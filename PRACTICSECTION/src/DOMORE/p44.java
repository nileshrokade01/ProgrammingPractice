package DOMORE;
//wap to find if no is Armstrong no in range 
//153=1 cube +5 cube+ 3 cube
public class p44 
{
	public static int countOfDigits(int n)
	  {
		  int count=0;
		  while(n!=0)
		  {
			  count++;
			  n=n/10;
		  }
		  return count;
	
	  }
	      public static void main(String[] args) {
			for(int n=1;n<=1000;n++)
			{
				int temp=n,sum=0,count=countOfDigits(n);
			
				while(n!=0)
				{
				int d=n%10;
				sum=sum+pow(d,count);  //d=3  count
				n=n/10;
				
				}
				n=temp;
			      
		
				if(sum==temp)
				{
					System.out.println(n);
					
				}
//			else
//			{
//				System.out.println("Not an ArmStrong Number");
//			}
			
			}	
		}
	      public static int pow(int n,int p)
	      {
		     int res=1;
		     for(int i=1;i<=p;i++)
		     {
		    	 res=res*n;
		     }
		     return res;
		
	      }

}
