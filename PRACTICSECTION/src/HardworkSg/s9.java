package HardworkSg;
//wap to print occurrence of each character
public class s9 {
public static void main(String[] args) {
	String s = "happy";
	int count =0 ;
	char c[] = s.toCharArray();
	boolean []b = new boolean[c.length];
	
	for(int i=0;i<c.length;i++) {
		if(b[i]==false) {
			count = 1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					b[j]=true;
				}
			}
			if(count>0) {
				System.out.println("Occurrence of char "+c[i]+" is  "+count);
			}
		}
		
	}
}
}
