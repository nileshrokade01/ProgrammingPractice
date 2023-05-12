package HardworkSg;
// Combination
public class s11 {
public static void main(String[] args) {
	String s = "COMBINA";
	System.out.println(s);
	int i =1;
	while(s.length()-1!=0) {
		if(i%2==1)
		{
			s=s.substring(1);
		}
		else
		{
			s=s.substring(0,s.length()-1);
		}
		System.out.println(s);
	}
}
}
