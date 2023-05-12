package DOMORE;
//wap to find special no from 1 to 500
public class p41
{
    public static void main(String[] args) {
		
    	for(int i=1;i<=500;i++)
    	{
    		int temp=i;
    		int sum=0;
    		int product=1;
    		while(i!=0)
    		{
    			int d=i%10;
    			sum=sum+d;
    			product=product*d;
    			i=i/10;
    		}
    		
    		sum=product+sum;
    		if(temp==sum)
    		{
    			System.out.println(sum);
    		}
    		i=temp;
//    		else
//    		{
//    			System.out.println("not special no");
//    		}
    		
    	}
	}
}
