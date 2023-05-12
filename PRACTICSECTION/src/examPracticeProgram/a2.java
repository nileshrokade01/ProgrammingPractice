package examPracticeProgram;
//wap to find ALL the even elements from the array
public class a2 {
public static void main(String[] args) {
	int a[]= {1,2,3,2,23,4,21,29};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.print(a[i]);
		}
	}
}
}
