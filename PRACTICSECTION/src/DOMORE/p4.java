package DOMORE;
//WAPT FIND PRODUCT OF ALL THE EVEN NO IN THE RANGE 1-10
public class p4 
{
    public static void main(String[]args)
    {
    	int product=1;
    	for(int i=1;i<=10;i++)
    	{
    		if(i%2==0)
    		{
    		product=product*i;
    		}
    	}
    	System.out.println(product);
    }
}


//by using of while loop
/*int i=10;
    	int product=1;
    	while(i!=0)
    	{
    		if(i%2==0)
    		{
    			product=product*i;
    		}
    		i--;
    	}  */
