package examPracticeProgram;
//wap to search the element used the liner search technique
public class a8 {
public static void main(String[] args) {
	Object a[]= {1,2,3,45,45,"hii",'h',6.01};
	Object search ='h';
	boolean b=false;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==search)
		{
			b=true;
			System.out.println("element find in index : "+ i);
			break;
		}
		
	}
	if(b==false)
	{
		System.out.println("the element is not present inside these array");
	}
}
}
