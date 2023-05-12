package ArayPrograms;


import java.util.LinkedList;
import java.util.PriorityQueue;
//import java.util.LinkedList;
public class arrayQ {

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(0,null);
		l.offer(10);
		l.add(20);
		l.offer("hii");
		l.add(3,12);
		System.out.println(l);
		
		PriorityQueue p=new PriorityQueue();
		
		p.offer(10);
		//p.offer("jii");
		//p.offer(null);
		//p.offer(1,25);
		p.offer(55);
		p.offer(2);
		p.offer(-52);
		p.offer(+10);
		System.out.println(p);
				
				
		

	}

}
