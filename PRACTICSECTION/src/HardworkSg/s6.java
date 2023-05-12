 package HardworkSg;
// wajp to print first duplicates characher in the given String
public class s6 {
public static void main(String[] args) {
	String s = "Hapapyh independs day";
	// fist dup. char is c
	boolean b= false;
	char [] c = s.toCharArray();
	for(int i = 0 ; i<c.length;i++) {
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j]) {
				System.out.println(c[i]);
				b=true;
				break;
			}
			
		}
		if(b==true)
		{
			break;
		}
	}
}
}
