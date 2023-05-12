package String;
//wap to step 1 : remove the first character step 2 remove last character
public class Remove1stcharacter {

	public static void main(String[] args) {
		String a="COMBINATION";
		System.out.println("size of a : "+a.length());
		System.out.println();
		System.out.println(a);
		int i=0;
		while(a.length()!=1)
		{
			if(i%2==0)
			{
				a=a.substring(1);
				
				
			}
			else
			{
				a=a.substring(0,a.length()-1);
						
			}
			System.out.println(a);
			i++;
		}
	}
}
