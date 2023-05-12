package DOMORE;
//WAP TO FIND FACTORIAL OF A NUMBER
public class p6 {

		public static void main(String[] args) {
		
         
		int pro=1;
		for(int i=1;i<=7;i++)
		{
			pro=pro*i;
		}
		System.out.println(pro);
		int j=1;
		pro=1;
		do
		{
			pro=pro*j;
			//System.out.println(pro);
			j++;
		}
		while(j<=7);
		System.out.println(pro);
	}

}
