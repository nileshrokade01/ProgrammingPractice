package ArrayProgramingPrograms;
//wap to sort the element by using of insert sort
public class InsertionSort {
public static void main(String[] args) 
{ //   index 0,1,2,3,4   size=5
	int[]a= {3,2,5,1,4};  //{3,3,5,1,4}  {2,3,5,1,4} {2,2,5,1,4} {1,2,5,1,4}
	for(int i=1;i<a.length;i++)  //we take i=1 means index 1 bcz we want compare selected element  into previous element
	{                       //i=1,2,3,4
		int temp=a[i]; //temp=2,5,1
		int j=i; //j=1,2,3          ||  store index i=1
		while(j>0 && a[j-1]>temp)  //3>2t 3>5F 5>1t 3>1t 2>1t
		{
			a[j]=a[j-1];  //a[1]=3,a[3]=5,a[2]=3,a[1]=2
			j=j-1;  //j=0,2,1,0
			
		}
		a[j]=temp;  //a[0]=2 a[2]=5 a[0]=1
		
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
