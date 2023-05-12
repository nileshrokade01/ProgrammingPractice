package ArrayProgramingPrograms;
//wap to print total decrement operations performed to make the
//elements of the array divisible by an integer
public class InterviewQ {
 
	public static void main(String[] args) {
		
		
		int k=6;
		int sum=0;
		int []a= {5,9,12,16,25};
		for(int i=0;i<a.length;i++)
		{
			sum=sum+(a[i]%k);
			
			//System.out.println(a[i]%k);
			
		}
		System.out.println("Total Decreament is : "+sum);
	}
	
}
