package String;
//wap to write all method of string buffer class
public class StringBuffer5Method {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("java is a programming");
	
	sb.append(" Language");  //it used for join the two string(concatination)
	System.out.println(sb);
	sb.insert(5,"is ");      //it used to insert the new string
	System.out.println(sb);
	sb.delete(10,21);        //it is used to delete the string
	System.out.println(sb);
	sb.replace(0, 5, "English ");  //it is used to replace the word with new word
	System.out.println(sb);
	sb.reverse();            //it is used to reverese the total string
	System.out.println(sb);
}
}
