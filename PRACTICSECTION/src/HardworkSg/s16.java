package HardworkSg;

import java.util.Arrays;

//wap to print largest no and second largest no square sum and smallest and second smallest no square sum
//after that both square are minus with each other
public class s16 {
public static void main(String[] args) {
	String s = "11,5,7";
	int l1=Integer.MIN_VALUE;
	int l2=Integer.MIN_VALUE;
	int s1=Integer.MAX_VALUE;
	int s2=Integer.MAX_VALUE;
	String[] a=s.split(",");
	System.out.println(Arrays.toString(a));
	System.out.println(a[0]);
	for(int i=0;i<a.length;i++) {
		int n = Integer.parseInt(a[i]);
		if(n>l1) {
			l2=l1;
			l1=n;
		}
		else if(n>l2 && n!=l1) {
			l2=n;
		}
		int m = Integer.parseInt(a[i]);
		if(m<s1)
		{
			s2=s1;
			s1=m;
		}
		else if(m<s2 && m!=s1) {
			s2=m;
		}
	}
	System.out.println("largest no "+l1);
	System.out.println("2nd large no "+l2);
	System.out.println("1st small no "+s1);
	System.out.println("2st small no "+s2);
	int sum=0,sum1=0;
	sum=s1*s1 + s2*s2;
	sum1=l1*l1 + l2*l2;
	sum=sum1-sum;
	System.out.println(sum);
			
		
}
}
