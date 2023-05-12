package DOMORE;
//wap to print special no
//45=4+5 + 4*5==45 then it is special no
//wap to check their no sum is single digit no or not
//39=3+9=12==39
//WAP TO FIND RESULT FOR NO RAISE TO POWER
//
public class practiceNo1 
{
   public static void main(String[] args) 
   {
	   for(int n=1;n<=1000;n++)
	   {
	  
	  int p=3;
	  int res=1;
	  for(int i=1;i<=p;i++)
	  {
		  res=res*n;
	  }
	  System.out.println(res);
   }
   }
}
