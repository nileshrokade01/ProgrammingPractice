package ArayPrograms;
//wap to sort  the elements by using selection sort.....
public class pp3
{
	public static void main(String[] args) {
		int a[]= {22,21,2,2,21,01,2};
		       //{01,21,2,2,21,22,2}
		       //{01,02,21,2,21,22,2}
		
		for(int i=0;i<a.length;i++)
			//i=1
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;  //min=2
				}
				
			}
			int temp=a[i]; //temp=21
			a[i]=a[min];   //a[1]=2
			a[min]=temp;   //a[2]=21
			System.out.print(a[i]+" ");
		}
	}

}
