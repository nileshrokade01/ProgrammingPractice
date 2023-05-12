package DOMORE;
//wap to find power 2 of a number 5
public class PowerFInd {
public static void main(String[] args) {
	int power=3;
	int n=15;
	int res=1;
	for(int i=1;i<=100;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			res=1;
			for(int k=1;k<=power;k++)
			{
				res=res*j;
			}
			
		}
		System.out.println(res);
	}
}
}
