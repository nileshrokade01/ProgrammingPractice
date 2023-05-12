package DOMORE;
//WATP ALL THE ODD DIGITS FROM  NO.

public class p20 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     int n=346;
     while(n!=0)
     {
    	 int d=n%10;
    	 
    	 if(d%2==1)
    	 {
    		System.out.println(d); 
    	 }
    	 n=n/10;
     }
    	 
	}

}
