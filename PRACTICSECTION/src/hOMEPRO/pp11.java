package hOMEPRO;
//wap to swapp to string with each other 
import java.util.Scanner;

public class pp11 {
	public static void main(String[] args) {
		String str="123456789";
		System.out.println(str);
		
		for(int i=0;str.length()>1;i++)
		{
			if(i%2==0)
			{
				str=str.substring(1);
				
			}
			else
			{
				str=str.substring(0,str.length()-1);
				
			}
			
			//System.out.println(str.length() + "  i : "+i);
			System.out.println(str);
		}
		
		
	}

}
