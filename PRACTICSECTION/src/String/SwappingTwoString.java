package String;
//16 jan 1st
//wap to swapp the two string
public class SwappingTwoString {
	
	public static void main(String[] args) {
		String a="Hello";  //a.length=5
		String b="Byesss";    //b.length=6
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a=a.concat(b)  ;  //a=HelloByesss
		//a=a+b;  //L=11
		b=a.substring(0,a.length()-b.length());
		//substring(index 0) we select the first value
		//substring(int index 0,int index 1) : 
		//           select 1st     select last index-1
		
		a=a.substring(b.length());
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
