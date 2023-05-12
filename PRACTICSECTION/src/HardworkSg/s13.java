package HardworkSg;
// wap to display the smallest length String
public class s13 {
public static void main(String[] args) {
	String a[]= {"hiiii","byee","ni","dfjjndf"};
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i].length()>a[j].length())
			{
				String temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
	}
	System.out.println("The smallest String is : "+a[0]);
}
}
