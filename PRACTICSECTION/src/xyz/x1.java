package xyz;
//wajp to find the largest String square sum and smallest string square sum, after both square are minus with each other

public class x1 {
	public static void main(String[] args) {
		
		String str="11,5,7,11,7";
		String[] a=str.split(",");
		int large1=Integer.MIN_VALUE;
		int large2=Integer.MIN_VALUE;
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			int x=Integer.parseInt(a[i]);
			if(x>large1 )
			{
				
				large1=x;
			}
			else if (large2<x && x!=large1)
			{
				large2=x;
			}
			if(small1>x)
			{
				small1=x;
			}
			else if(small2>x && small1!=x)
			{
				small2=x;
			}
		}
		large1=(large1*large1)+(large2*large2);
		small1=(small1*small1)+(small2*small2);
		large1=large1-small1;
		System.out.println(large1);
		
		
		
		
		
		
	}

}
