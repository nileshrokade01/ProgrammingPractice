package examPracticeProgram;
//wap to check the number is palindrome number or not
public class PalindromeNumber {
public static void main(String[] args) {
	int n=202,temp=n;
	int rev=0;
	while(n!=0)
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
		
	}
	n=temp;
	if(n==rev)
	{
		System.out.println("Palindrome Number");
	}
	else
	{
		System.out.println("Not an Palindrome");
	}
	
	
}
}
