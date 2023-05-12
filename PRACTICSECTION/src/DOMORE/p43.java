package DOMORE;
//wap to find if no is Armstrong number
//taking cube/Square is depend on how many digits are present inside the number 
//153=1 cube +5 cube+ 3 cube
public class p43 {
	public static int countOfDigits(int n)
	  {
		  int count=0;
		  while(n!=0)
		  {
			  count++;  
			  n=n/10;  //  n=153/10=15
		  }
		  return count;
	
	  }
	      public static void main(String[] args)
		{
			
			int n=153,temp=n,sum=0,count=countOfDigits(n);
			
			while(n!=0)
			{
				int d=n%10;
				sum=sum+pow(d,count);  //d=3  count
				n=n/10;
			}
			if(sum==temp)
			{
				System.out.println("ArmStrong Number");
				
			}
			else
			{
				System.out.println("Not an ArmStrong Number");
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


