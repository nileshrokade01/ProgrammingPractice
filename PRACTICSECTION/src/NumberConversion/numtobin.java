package NumberConversion;
//wap to convert number to binary


//System.out.println("d"+2+2+1+22);
//System.out.println('k'-01);
public class numtobin 
{
	public static void main(String[] args) 
	{
		int n=14;
		String res="";
		
		while(n!=0)
		{
			int r=n%2;
			res=r+res;
			n=n/2;
		}
		System.out.println(res);
		

	}
}

