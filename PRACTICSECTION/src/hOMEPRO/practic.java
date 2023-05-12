package hOMEPRO;
//wap to convert the no binary to octal
//n=0101
//1*2 res 0+0*2 res 1+1*2 res 2+0*2 res 3
public class practic
{
	public static void main(String[] args) {
		 int n=1010;
		 int power=0;
		 int sum=0;
		 String s="";
		 
		 
		 while(n!=0)
		 {
			 int d=n%10;
			 sum=d*pow(2,power)+sum;
			 power++;
			 n=n/10;
			 
		 }
		   //System.out.println(sum);
		 while(sum!=0)
		 {
			 int o=sum%8;
			 s=o+s;
			sum=sum/8; 
		 }
		 System.out.println(s);
		 
		 
	}
	public static int pow(int m,int p)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*m;
		}
		return res;
	}
	

}
