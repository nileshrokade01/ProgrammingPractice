package xyz;
//wap to calculate total dupplicate char in the given string
public class s5 {
public static void main(String[] args) {
	String s="haaaaaaphphyph";
	int total=0;
	int count =0;	
	char []c=s.toCharArray();
	boolean b[]=new boolean[c.length];
	for(int i=0;i<c.length;i++)
	{
		if(b[i]==false) {
		count = 1;
		for(int j=i+1;j<c.length;j++)
		{
			
			
			if(c[i]==c[j])
			{
				b[j]=true;
				count++;
			}
		}
		
		if(count > 1)
		{
			System.out.println(c[i]+" "+count);
			//System.out.println(c[i]);
			total++;
			
		}
		count=0;
	}
		}
	System.out.println("total number of dupplicates is : "+total);
	
		
}
}
