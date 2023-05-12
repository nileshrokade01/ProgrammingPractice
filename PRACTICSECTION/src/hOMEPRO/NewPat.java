package hOMEPRO;

public class NewPat {

	public static void main(String[] args) {
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(c+r<=6 && c>=r || (r>=4 && (r>=c && r+c>=6) ))
				{
					System.out.print(c+" ");
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
