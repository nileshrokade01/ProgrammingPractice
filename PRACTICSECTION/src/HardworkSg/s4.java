package HardworkSg;

import java.util.Arrays;

//wajp to count total(sum) duplicates words in a given string

// OCCURANCE

public class s4 {
public static void main(String[] args) {
	String s = "java is a   programming   language which is used to do programming";
	String[]a=s.split(" ");
	System.out.println();
	System.out.println(Arrays.toString(a));
	int total = 0,count=0;
	boolean b[] =new boolean[a.length];
	
	for(int i=0;i<a.length;i++)
	{
		 count =1;
		if(b[i]==false) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i].equals(a[j])) {
					count++;  //c=2
					b[j]=true;
				}
			}
			if(count>1) {
				total++;
			}
		}
		
	}
	System.out.println();
	
	System.out.println("The total number of dupplicate is : "+total);
}
}
