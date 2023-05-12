package HardworkSg;

import java.util.Arrays;

// wap on to find occurrence of each duplicates character
public class s7 {
public static void main(String[] args) {
	String s = "happy_birthdapyhhhh";
	char []c = s.toCharArray();
	//to convert the above string into the character array
	System.out.println(Arrays.toString(c));
	int count =0;
	boolean b[] = new boolean[c.length];
	for( int i = 0;i<c.length;i++) {
		
		if(b[i]==false) 
		{
			count =1;
		for(int j=i+1;j<c.length;j++) 
     {
			
			if(c[i]==c[j])
			{
				b[j]=true;
				count++;
				
			}
				
			
			
      }
		if(count>1) {
			System.out.println(c[i]+" "+count);
			
					}
		}
		
	}
}
}
