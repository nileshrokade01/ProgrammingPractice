package HardworkSg;
// StringBuffer class all method 
// it is a mutable class,, it is similar to String class except is mutable we can easily change the String present inside the sb class
// it is present inside java.lang package
// we cannot giving direct litterals in StringBuffer class
// Object creation is mandatory
// we have varous method in StringBuffer class which are as follow
public class s15 {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("java is a Language");
	System.out.println(sb);
	// 1. append()
	sb.append(" which is used to do programming");
	System.out.println(sb);
	
	// 2.insert()
	
	sb.insert(9," programing");
	System.out.println(sb);
	
	// 3. delete()
	sb.delete(30,61);
	System.out.println(sb);
	
	// 4. replace();
	sb.replace(0, 4,"English");
	System.out.println(sb);
	
	// 5. reverse();
	sb.reverse();
	System.out.println(sb);
	
}
}
