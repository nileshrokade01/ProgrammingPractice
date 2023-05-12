package ProgramHolic;
// WRITE A PROGRAM TO CHECK THE NUMBER IS PRIME NUMBER OR NOT
class p1{
	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
		int n=1,count=0;
			while(n<=i) {
				if(i%n==0) {
					count++;
				}
				n++;
			}
			System.out.println(count==2?i+" : Is Prime Number":i+" Is Not a Prime No.");		
		}
	}
}