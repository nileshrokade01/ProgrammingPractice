package HardworkSg;
// wap to print reverse the sentence without reversing the word

import java.util.Arrays;

public class s12 {
	public static void main(String[] args) {
		String str = "Welcome to metter";
		String s[] = str.split(" ");
		System.out.println(str);
		//System.out.println(Arrays.toString(s));
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
			
		}
	}

}
