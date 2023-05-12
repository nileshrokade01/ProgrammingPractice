package ArayPrograms;

import java.util.Arrays;

//wap to print total decreament oprations performed to make the
//elements of the array divisible by an integer

public class intervewQimp
{
	public static void main(String[] args) {
		int k=6;
		int sum=0;
		
		int [  ]a= { 5,9,12,16,25,15 };
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			int d=a[i]%k;
			
				sum=sum+d;
			
		}
		System.out.println(sum);
	}

}
