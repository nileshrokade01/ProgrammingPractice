package DOMORE;
//wap TO DISLAY NEVEN NO. OR NOT
//15=1+5
//21=2+1  21/3
public class p26 {

	public static void main(String[] args) 
	{
		
		int n=36;
		int temp=n;
		int sum=0;
		while (n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("neven no");
		}
		else
		{
			System.out.println("not neven no");
		}
		

	}

}
