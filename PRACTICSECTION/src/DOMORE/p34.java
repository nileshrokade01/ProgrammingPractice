package DOMORE;
//wapto find palindrome no.
public class p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=121;
     int t=n;
     int rev=0;
     while(n!=0)
     {
    	 int d=n%10;
    	 rev=rev*10+d;
    	 n=n/10;
     }
     if(t==rev)
     {
    	 System.out.println("pelentron no");
     }
     else
     {
    	 System.out.println("not a pelentron no");
     }
    		 
	
	}

}
