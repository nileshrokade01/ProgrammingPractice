package DOMORE;
//wap to check the number is strong number or not
//145= 1! + 4! + 5! =1 + 4*3*2*1 + 5*4*3*2*1 = 145
//145=145 
import java.util.Scanner;
public class StrongNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check is it strong number or not");
	int n=sc.nextInt();
	for(int i1=1;;i1++)
	{
	int tempu=n;
	int sum=0,pro=1;
	while(n!=0)
	{
		int d=n%10;
		pro=1;
		for(int i=1;i<=d;i++)
		{
			pro=pro*i;
		}
		sum=sum+pro;
		n=n/10;
		
	}
	n=tempu;
	if(n==sum)
	{
		System.out.println(n+" is Strong Number");
		break;
	}
	else
	{
		System.out.println(n+" is not Strong number");
		break;
	}
	}
}

  
  }
