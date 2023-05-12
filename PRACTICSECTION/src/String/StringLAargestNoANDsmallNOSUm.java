package String;

import java.util.Arrays;

//wap to print largest no and second largest no square sum and smallest and second smallest no square sum
//after that both square are minus with each other
public class StringLAargestNoANDsmallNOSUm {
	public static void main(String[] args) {
		String s="11,5,7";
		String[] a=s.split(",");
		System.out.println(a[0]+a[2]);
		System.out.println(Arrays.toString(a));
		int large1=Integer.MIN_VALUE;
		int large2=Integer.MIN_VALUE;
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int x =Integer.parseInt(a[i]);
			
			if(x>large1)
			{
				large1=x;
			}
			else if(x>large2 && x!=large1)
			{
				large2=x;
			}
			if(x<small1)
			{
				small1=x;
			}
			else if(x<small2 && x!=small1)
			{
				small2=x;
			}
		}
		int sum1=large1*large1 + large2*large2;
		int sum2=small1*small1 + small2*small2;
		System.out.println(sum1-sum2);
	}
}
	