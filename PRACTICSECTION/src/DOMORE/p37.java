package DOMORE;
//WAP TO FIND PERFECT SQUARE FROM NO 1 TO 1000
public class p37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=false;
	 for(int i=1;i<=1000;i++)
	 {
		 
		 for(int n=1;n*n<=i;n++)
		 {
			 if(n*n==i)
			 {
				 b=true;
				 System.out.println(i);
			 }
		 }
	 }
	 if(b==false)
	 {
		 System.out.println("not a perfect sqauere");
	 }
	}

}
