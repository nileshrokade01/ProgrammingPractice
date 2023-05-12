package hOMEPRO;

class p1
{
	double d=5.5;
}
class p2 extends p1
{
	double d=11.5;
	int d1=(int)d;
}
public class DownCasting 
{
	public static void main(String[] args) 
	{
		p1 ref=new p2();
		p2 ref1=(p2)ref;
		System.out.println(ref1.d);
		System.out.println(ref.d);
		p2 re=new p2();
		System.out.println(re.d1);
		
		
	}

}
