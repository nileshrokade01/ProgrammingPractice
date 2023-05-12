package ArayPrograms;


import java.util.LinkedHashSet;
import java.util.Iterator; 
import java.util.ListIterator;import java.util.*;
public class aray {

	public static void main(String[] args) 
	{
		System.out.println("adding members are 10,20,-5,null,20,hii");
		System.out.println("BY USING LinedHashSeet");
		LinkedHashSet l=new LinkedHashSet();
		System.out.println(l);
		l.add(10);
		l.add(20);
		l.add(-5);
		l.add(null);
		l.add(20);
		l.add("hii");
		System.out.println(l);
		System.out.println("by using Hashset");
		
		HashSet l1=new HashSet();
		System.out.println(l1);
		l1.add(10);
		l1.add(20);
		l1.add(-5);
		l1.add(null);
		l1.add(20);
		l1.add("hii");
		//l.get(5);  not autherize
		System.out.println(l1);
		//LinkedHashSet i=l.iterator();
		/*  for(int i=0;i<=l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
		
		System.out.println("====by using for each loop we can get access");
		for(Object obj:l)
		{
			System.out.println(obj);
		}
		
		System.out.println("=====by using iterator()=========");
		Iterator i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("=====by using list iterator nothing happened=====");
		
		//ListIterator j=l.listItrator();
		
		System.out.println("TreeSet");
		TreeSet t=new TreeSet();
		t.add("hii");
		t.add("bye");
		t.add("zii");
		t.add("zza");
		t.add("za");
		t.add("add");
		//t.add('k');
		//t.add(10); hectrogeneout object are not allowed
		System.out.println(t);
		System.out.println("TREESET DSC: "+t.descendingSet());
		
		System.out.println("new object for treeset");
		TreeSet t1=new TreeSet();
		t1.add(10);
		t1.add(20);
		t1.add(-5);
		System.out.println(t1);

	}

}

/*adding members are 10,20,-5,null,20,hii
BY USING LinedHashSeet
[]
[10, 20, -5, null, hii]
by using Hashset
[]
[null, 20, -5, hii, 10]
====by using for each loop we can get access
10
20
-5
null
hii
=====by using iterator()=========
10
20
-5
null
hii
=====by using list iterator nothing happened=====*/


