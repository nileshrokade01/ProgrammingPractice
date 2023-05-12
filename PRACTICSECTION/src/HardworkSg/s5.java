package HardworkSg;
// ENDS-WITH-METHOD
import java.util.Scanner; // Scanner class is final class therefore we cannot override
public class s5 {
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mail acount here to verify : ");
		String a = sc.nextLine();
		
		if(a.endsWith("@ronil.com"))
		{
			System.out.println("correct input");
		}
		else
		{
			System.out.println("wrong input");
			String a1 = sc.nextLine();
			a=a1;
          
		}
	}  

 

}
