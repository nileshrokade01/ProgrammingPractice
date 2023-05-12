package DOMORE;
//WAP TO FIND SUM ALL DIGITS OF A NO
//452=4+5+2=11
public class P21 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
       int n=452;
       int sum=0;
       while(n!=0)
       {
    	   
    	   int d=n%10;
    	   
    	  
    		   //System.out.println(d);
    		   
    		   sum=sum+d;
    	  
    	  n= n/10;
    	 
    	  
       }
       System.out.println(sum);
	}

}
