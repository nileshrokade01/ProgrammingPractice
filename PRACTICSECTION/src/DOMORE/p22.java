package DOMORE;
//WAPTF PRODUCT OF ALL DIGITS OF A NO
public class p22 {

	public static void main(String[] args) 
	{
		int n=5264;
		int pro=1;
		while(n!=0)
		{
			int d=n%10;
			pro=pro*d;
			n=n/10;
		}
		System.out.println(pro);
	}

}
