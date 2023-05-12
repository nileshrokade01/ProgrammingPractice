package DOMORE;
//WAP TO SWAP 2 NO. WITHOUT USING 3RD VARIABLE
public class p13 {

	public static void main(String[] args)
	{
		int a =3;
		int b=7;
		System.out.println("BEFORE SWAPPING ");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		System.out.println("AFTER SWAPPING");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		

	}

}
