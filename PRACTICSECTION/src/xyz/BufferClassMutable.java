package xyz;
//mutable : we can easily change the class or object
//immutable : we cannot change object.
public class BufferClassMutable {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("my name nileshrokadu");
		
		System.out.println(sb);
		sb.append(" nila");
		System.out.println(sb);
		System.out.println(sb.indexOf("is",12 ));
		sb.length();
		System.out.println(sb.indexOf("nileshrokadu")+" "+ sb.length());
		sb.insert(8,"is ");
		sb.insert(22,"e");
		System.out.println(sb);
		sb=sb.delete(23, 29);
		sb.reverse();
		System.out.println(sb);
		String d="Nilkanth";
		System.out.println(d);
		System.out.println(d.indexOf("N"));
		
		
	}

}
