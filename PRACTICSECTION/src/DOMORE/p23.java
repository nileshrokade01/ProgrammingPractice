package DOMORE;
//wap to print sum of all the even digit of a no


public class p23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=256;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			if(d%2==0)
			{
				sum=sum+d;
			}
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
