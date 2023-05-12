package String;
//wap to print reverse the sententece without reveresing the word
public class ReverseSplitMethod {
	public static void main(String[] args) {
		String str="Welcome to mettel";
		String []a=str.split(" ");
		System.out.println(str);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
