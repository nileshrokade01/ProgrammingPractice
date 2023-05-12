package ArayPrograms;

public class tpp {
public static void main(String[] args) {
	char a[]= {'m','u','m','s','m','y'};
	for(int i=0;i<a.length;i++)
	{
		int min=i;
		for(int j=0+i;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
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
