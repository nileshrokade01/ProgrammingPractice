package examPracticeProgram;
//wap to find the reverse value of number
public class reveseValue {
	public static void main(String[] args) {

		int n=7969;
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
		}
		System.out.println(rev);

			
	
		
	}

}
