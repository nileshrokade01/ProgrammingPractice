package examPracticeProgram;
//wap to swap two no without using of third(3rd) variable
public class Swapping2no {
public static void main(String[]args)
{
	System.out.println("WITHOUT USING OF 3RD VARIABLE");
	int a=110;
	int b=15;
	System.out.println("before swapping ");
	System.out.println("a : "+a);
	System.out.println("b : "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping");
	System.out.println("a : "+a);
	System.out.println("b : "+b);
	
	//By using 3rd variable
	System.out.println("BY USING THIRD VARIABLE");
	int c=10;
	int d=7;
	System.out.println("before swapping ");
	System.out.println("c : "+c);
	System.out.println("d : "+d);
	int temp=c;
	c=d;
	d=temp;
	System.out.println("After swapping ");
	System.out.println("c : "+c);
	System.out.println("d : "+d);
	
	
}
}
