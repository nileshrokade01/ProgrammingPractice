package examPracticeProgram;
//wap to check the palindrome number in the range 1 to 1000
public class PalindromeNumInRange {
public static void main(String[] args) {
	int rev=0;
	int tempu=0;
	for(int i=1;i<=100;i++)
	{
		tempu=i;
		rev=0;
		while(i!=0)
		{
			int d=i%10;
			rev=rev*10+d;
			i=i/10;
		}
		i=tempu;
		if(i==rev)
		{
			System.out.println(i+" is Palindrome number");
		}
		else
		{
			System.out.println(i+" is not an Palindrome/Reverse number");
		}
	}
}
}
