package DOMORE;
//wap to print heart
public class p46 {
	public static void main(String[] args) {
		
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1 || c==3 || r==5)
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
		System.out.println();
		System.out.println();
		
		for(int r=1;r<=6;r++)
		{
			for(int c=1;c<=7;c++)
			{
				if(r==1 && (c!=1 && c!=4 && c!=7 ) || r==2 && ((r+c)%3==0) || r>=3 &&(r-c==2 || r+c==10))
				{
					System.out.print("** ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1 || c==3 || r==5)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(c==1 || c==5 || c==r)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(c==1 || (r==1 && r+c!=6 )|| (r==5 && r+c<=9 )|| c==5 && r!=1 &&r!=5 )
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1 || c==3 || r==5)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int r=1;r<=7;r++)
		{
			for(int c=1;c<=7;c++)
			{
				if(r==1  && c==4 || r==4 && c==4 ||( c!=4 && r!=7 && r>=2 && c>=3 && c<=5 ) 
						|| ( r==6 && c==7 || r==7 && c==2 || r==7 && c==6 )  )
				{
					System.out.print("# ");
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
