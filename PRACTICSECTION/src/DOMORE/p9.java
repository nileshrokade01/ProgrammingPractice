package DOMORE;
//WRITE A PROGRAM TO PRINT NO IN RANGE 21 TO 30 IN ODD NO AND 41 TO 60 EVEN NUMBER
public class p9 {

	public static void main(String[] args) {
		
		System.out.println("ODD NO.");
		for(int i=21;i<=30;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				//System.out.println("/n");
			}
		
		}
		System.out.println("======================================");
		
		System.out.println("EVEN NO.");

			 for(int  j=31;j<=60;j++)
			 {
				 if(j%2==0)
				 {
					 System.out.println(j);
				 }
			 }
		
	}

}
