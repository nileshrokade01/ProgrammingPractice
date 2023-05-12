package ArayPrograms;

import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
public class ARRAYLIDY {

	public static void main(String[] args) 
	{
		
	  LinkedList l=new LinkedList();
	  System.out.println(l);
		l.add(20);
		l.add("nil");
		l.add(null);
		l.add(20);
		l.add("nil");
		System.out.println(l);
	//	[20, nil, null, 20, nil]
       ArrayList a=new ArrayList();
       
       a.add(0,21);
       a.add("hii");
       a.add(1,null);
       a.add(3,15.5);
       a.add(4,'v');
       
       System.out.println(a);
       
       System.out.println("===iterator==============");
	
       Iterator i=a.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
       
        
       ListIterator j=a.listIterator();
       
       System.out.println("====== ListIterator forward ========");
       while(j.hasNext())
       {
    	   System.out.println(j.next());
       }
       
       System.out.println("====== ListIterator Backward ========");
       while(j.hasPrevious())
       {
    	   System.out.println(j.previous());
       }
       
	
	}

}

