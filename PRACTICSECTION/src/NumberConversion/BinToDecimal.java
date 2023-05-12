package NumberConversion;
//wap to convert bin to decimal.
//seperate digit
//add
//1110=1*2 cube+1*2 square+1*2+0*2 res to zero
public class BinToDecimal 
{
	public static void main(String[] args) {
		int n=1110;
		int sum=0;
		int power=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d*pow(2,power);
			power++;
			n=n/10;
		}
		System.out.println(sum);
	}
		public static int pow(int n,int p)
		{
			int res=1;
			for(int i=1;i<=p;i++)
			{
				res=n*res;
			}
			return res;
		}
	}


