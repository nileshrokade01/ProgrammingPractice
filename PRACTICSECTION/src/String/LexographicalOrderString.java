package String;
//wap to  sort all the strings in lexo-graphical order /alphabetical order         
public class LexographicalOrderString {

	public static void main(String[] args) {
		String [] a= {"welcome","hi","bye","hello"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+0;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
