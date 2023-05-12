package ArrayProgramingPrograms;
//wap to select your name letter in ascending order by using selection sort
public class sortnameinAscendingbyselectionsort {
  public static void main(String[] args) {
	
	  char[]a= {'n','i','l','e','s','h'};
	  
	  for(int i=0;i<a.length;i++)
	  {
		  int min=i;
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[j]<a[min])
			  {
				  min =j;
				  
			  }
		  
		  }
		  char temp=a[i];
		  a[i]=a[min];
			a[min]=temp;
	  }
	  for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}

}
}

