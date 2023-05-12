package ArayPrograms;

import java.util.Stack;
class c1{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push("hii");
		s.push(400);
		s.push('c');
		s.push(-5);
		
		System.out.println("Stack: "+ s);
		System.out.println("peek : "+ s.peek());
		System.out.println("Stack: "+ s);
	 System.out.println(" pop : " + s.pop());
		System.out.println("Stack: "+ s);
}
}

