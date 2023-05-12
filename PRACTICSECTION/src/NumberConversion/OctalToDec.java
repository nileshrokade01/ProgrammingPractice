package NumberConversion;
//wap to convert no. octal to dec...
public class OctalToDec 
{
  public static void main(String[] args) {
	   int n=199;
	  int sum=0;
	int power=0;
	
	while(n!=0)
	{
		int d=n%10;
		sum=sum+d*pow(8,power);
		//System.out.println(sum);
		power++;
		n=n/10;
	}
	System.out.println(sum);
}
  
  public static int pow(int n1,int p)
  {
	  int res=1;
	  for(int i=1;i<=p;i++)
	  {
		  res=res*n1;
	  }
	  return res;
	  
  }
}
