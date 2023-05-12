package ArrayProgramingPrograms;
//wap to find smallest element inside the array
public class SmallestElement {
public static void main(String[] args) {
	int []a= {11,12,15,14,-24,2,7};
	int small=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(small>a[i])
		{
			small=a[i];
		}
	}
	System.out.println(small);
}
}
