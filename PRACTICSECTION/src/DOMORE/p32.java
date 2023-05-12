package DOMORE;
//WAP TO FIND smallEST DIGIT IN THE NUMBER
public class p32 {

	public static void main(String[] args)
	{
		int n=5164;
		int small=9;
		while(n!=0)
		{
			int d=n%10;
			if(d<small)
			{
				small=d;
			}
				n=n/10;
		}
		System.out.println(small);
	}

}
