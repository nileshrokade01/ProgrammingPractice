package HardworkSg;
//wap program on anagram
public class s3 {
public static void main(String[] args) {
	String s1 = "t1ooa";
	String s2 = "1ao/ot";
	
	if(s1.length()==s2.length()) {
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		sort(c1);
		sort(c2);
		boolean b = true;
		for(int i =0 ; i<c2.length;i++)
		{ 
			if(c1[i]!=c2[i])
			{
				 b = false;
				 break;
			}		
		}
		if(b==true)
		{
			System.out.println("Both String are Anagram");
			//System.out.println(b);
		}
		else
		{
			System.out.println(" not an Anagram");
			//System.out.println(b);
		}
	}
	else
	{
		System.out.println("both String are not an Anagram");
		//System.out.println(b);
	}
	
}

public static void sort(char[] c) {
	
	for(int i=0;i<c.length;i++)
	{
		    //   i=3                   1tooa
		for(int j=i+1;j<c.length;j++) //01234   temp = t
		{
			char temp=c[i]; //j=4
			if(c[i]>c[j]) {
				c[i]=c[j];  //1.1otoa   2. 1atoo 3.1aoot
				c[j]=temp;
			}
		}
	}
	
}
}
