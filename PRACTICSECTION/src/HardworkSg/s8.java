package HardworkSg;

import java.util.Arrays;

// wap to sort all the Strings in Lexo-graphical order or Alphabetical order
public class s8 {
public static void main(String[] args) {

	String [] a= {"welcome","hi","bye","hello"};
	System.out.println("Before sorting");
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i].compareTo(a[j])>0) {
				String temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
	}
	System.out.println();
	System.out.println("After Sorting");
	System.out.println(Arrays.toString(a));
	 
}

}

