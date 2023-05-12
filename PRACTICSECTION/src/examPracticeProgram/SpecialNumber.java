package examPracticeProgram;
//wap to find the Special Number
//Special Number means 39=(3+9)+(3*9)=12+27=39
import java.util.Scanner;
public class SpecialNumber {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Value to check it is"
			+ " Special Number or not");
	int i=sc.nextInt(),tempu=i,sum=0,pro=1;
	while(i!=0)
	{
		int d=i%10;
		sum=sum+d;
		pro=pro*d;
		i=i/10;
	}
	sum=sum+pro;
	if(sum==tempu)
	{
		System.out.println(tempu+" is Special number");
	}
	else
	{
		System.out.println(tempu+" is not a Special number");
	}
	
   }
  }
