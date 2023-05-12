package examPracticeProgram;
//wap to convert the number binary to octal
//(1011) base 2  : (n) base 8
public class binarYtOoCtal {
	public static int pow(int a,int p)
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*a;
		}
		return res;
	}
public static void main(String[] args) {
	int n=1111; // binary number
	int sum=0;
	String s="";
	int power=0;
	while(n!=0)
	{
		int d=n%10;
		sum=sum+pow(2,power)*d;
		power++;
		n=n/10;
	}
	n=sum;
	while(n!=0)
	{
		int d=n%8;
		s=d+s;
		n=n/10;
	}
	System.out.println(s);
	
}
}
