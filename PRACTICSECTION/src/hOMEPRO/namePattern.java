package hOMEPRO;
//wap to print your pattern name
public class namePattern {
public static void main(String[] args) {
	
	for(int r=1;r<=5;r++)
	{
		for (int c=1;c<=5;c++)
		{
			if(c==1 || c==r || c==5)
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
			if(r==1 || r==5 ||c==3)
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
	
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if(c==1 || (r==5 && c<=4))
			{
				System.out.print("! ");
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
			if(r==1 || c==1 || (r==3 && c<=4) || r==5)
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
	
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if(r==1 || (r==2 && c==1)|| r==3 || (r==4 && c==5) || r==5 )
			{
				System.out.print("$ ");
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
			if(c==1 || c==5 || r==3)
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
System.out.println();
System.out.println();
	for(int r=1;r<=5;r++)
	{
		for(int c=1;c<=5;c++)
		{
			if(r==1 || c==1 || (c==5 && r<=3 )|| (r==3 && c>=3)|| (r==c && r>=4) )
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
			if(r==1 || r==5 || c==1 || c==5)
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
			if(c==1 || (r+c==5) || (r-c==1) )
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
			if(r==3|| (r+c==4 || (r==2 && c==4)|| (r>=3 && c==1 || r>=3 && c==5)))
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
			if(c==1 || (r==1 && c<=4)||(r==5 && c<=4) || (c==5 && (r>1 && r<5)))
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
			if(r==1 || c==1 || (r==3 && c<=4) || r==5)
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
