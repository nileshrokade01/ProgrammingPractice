package Pattern1;
//left cross
public class leftCross {
public static void main(String[] args) {
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if(r+c==6)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
