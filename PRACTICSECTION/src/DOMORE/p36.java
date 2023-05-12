package DOMORE;
//WAP TO CHECK IF THE NO IS PERFECT SQUARE OR NOT
public class p36 {

	public static void main(String[] args) {
		

		
		int n=64;
		boolean b=false;
		for(int i=1;i*i<=n;i++)
		{
			
			if (i*i==n)
			{
				b=true;
				System.out.println("PERFECT SQUARE");
				
				
			}
		}
		if(b==false)
		{
			System.out.println("NOT A PERFECT SQUARE");
		}
	}

}
