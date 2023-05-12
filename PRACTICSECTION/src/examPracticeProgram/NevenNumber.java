package examPracticeProgram;
//wap to find neven number
//15=1+5=6   ||  15%6!=0
//12=1+2=3   12%3==0
public class NevenNumber {
public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=100;i++)
	{
		int temp=i;
		sum=0;
		while(i!=0)
		{
			int d=i%10;
			sum=sum+d;
			i=i/10;
		}
		i=temp;
		if(i%sum==0)
		{
			System.out.println(i+" is a neven number");
		}
	}
}
}
