package DOMORE;
//wap to check all the palindrome no from 1 to 1000
public class p35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("ji");
		
		for(int i=1;i<=1000;i++)
		{
			
			int temp=i;
			int rev=0;
			while(i!=0)
			{
				int d=i%10;
				rev=rev*10+d;
				i=i/10;
				
			}
			
			if(temp==rev)
			{
				System.out.println(temp);
			}
			i=temp;
		}
	}

}
