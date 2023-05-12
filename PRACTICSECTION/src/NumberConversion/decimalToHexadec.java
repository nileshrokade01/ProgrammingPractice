package NumberConversion;

//wap to convert decimal no to hexAdecimal no
public class decimalToHexadec 
{
 public static void main(String[] args)
 {
	   int n=997;
	   String res="";
	   while(n!=0)    //5!=0 true
	   {
		   int r= n%16;
		  if(r==10)
		  {
			  res="a"+res;
		  }
		  else if(r==11)
		  {
			  res="b"+res;        //res="b"
		  }
		  else if(r==12)
		  {
			  res="c"+res;
		  }
		  else if(r==13)
		  {
			  res="d"+res;
		  }
		  else if(r==14)
		  {
			  res="e"+res;
		  }
		  else if(r==15)
		  {
			  res="f"+res;
		  }
		  else
		  {
			  res=r+res;   //res=11+"b"="11b"  5+"11b"="511b"
		  }
		   n=n/16;  //n=5
		   
	   }
	   System.out.println(res);
 }
}



