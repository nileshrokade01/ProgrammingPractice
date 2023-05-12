package examPracticeProgram;
//wap to search element by using binary search technique
public class a9 {
	public static void main(String[] args) {
		int a[] = {1,2,3,3,4,5};
		int sp=0;
		int ep=a.length-1;
		int mp=(sp+ep)/2;  //mp=2
		int search=2;
		
		while(sp<=ep)
		{
			if(search==a[mp])
			{
				System.out.println("Element found in index : "+mp);
				break;
			}
			else if(search>a[mp])
			{
				sp=mp+1; //sp=5
			}
			else if(search<a[mp])
			{
				ep=mp-1;
			}
			mp=(sp+ep)/2;  //mp=5,0,1
		}
		if(sp > ep)
		{
			System.out.println("Element is not found in that array");
		}
		
	}

}
