package DOMORE;
//WAP TO FIND LARGEST DIGIT IN THE NUMBER
public class p31 {

	public static void main(String[] args) 
	{
		int n=558626;
		int max=0;
		
		
		while(n!=0)
		{
			
			int d=n%10;
			if(d>max)
			{
				max=d;
			}
			n=n/10;
			
		}
		System.out.println(max);
		
		

	}

}
