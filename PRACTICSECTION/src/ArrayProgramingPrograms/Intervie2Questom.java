package ArrayProgramingPrograms;
//consider a square matrix A of size N*N and an integer X which is an element of A. Find the row number 
// R and column no of K in A, and column R and C. If the sum is even ,find the sum of the digits of all even 
//number in the matrix ,and if the sum is odd then find the sum of digits of matrix

//Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings while reading the 
//the input or printing the standard output

//Constraints
// 1] 1<N<35
// 2] 0<=R , C<N
// 3] X is always  an element of A
// 4] Elements of A are unique.

//Input Format : 
// the first line of input contains N
// Next N lines of input contain N integers,each separated by single white space
// The last line of input contains X

//Output Format
// The output contain S.

//Sample Input1
// 3
// 11 22 33
// 44 55 66
// 77 88 99
// 55

//Explanation1
// Given Matrix is 
//  11 22 33
//  44 55 66
//  77 88 99
// here, X=55 present at the second row and the second column, so r=2, and c=2
// R+C = 4
//Therefore, s=(2+2)+(4+4)+(6+6)+(8+8)=4+8+12+16=40
public class Intervie2Questom {
	
	public static int sumOfDigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[][]= {{11,22,33},{44,55,66},{77,88,99}};
		int sum=0;
		int r=0;
		int c=0;
		int x=55;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==x)
				{
					r=i;
					c=j;
					break;
				}
			}
		}
		if((r+c)%2==0)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]%2==0)
					{
						sum=sum+sumOfDigit(a[i][j]);
					}
				}
			}
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(a[i][j]%2==1)
					{
						sum=sum+sumOfDigit(a[i][j]);
					}
				}
			}
		}
		
		System.out.println(sum);
		
		
	}

}
