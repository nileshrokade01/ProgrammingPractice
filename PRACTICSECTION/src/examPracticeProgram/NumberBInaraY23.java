package examPracticeProgram;
//wap to convert the number into binary(1010 format)
public class NumberBInaraY23 {
public static void main(String[] args) {
	
	int n=13+2	;
	String s="";
	
	while(n!=0)
	{
		int d=n%2;
		s=d+s;
		n=n/2;
	}
	System.out.println(s);
}
}
