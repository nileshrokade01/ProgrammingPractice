package ArrayProgramingPrograms;
//wap to find the missing number in an array
public class Missingno {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,10,11,12};
		//we check the duplicates
		//range
		//sorted
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}
		System.out.println("sum of all the elements:"+sum1);
		int sum2=0;
		//1+2+3+4+5=15
		for(int i=1;i<=a.length+1;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of element in range:"+sum2);
		
		System.out.println("Missing Number :"+(sum2-sum1));
	}

}
