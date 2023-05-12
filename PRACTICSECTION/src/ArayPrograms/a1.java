package ArayPrograms;
import java.util.Stack;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class a1 {

	public static void main(String[] args)
	{
		HashMap h=new HashMap();
		h.put(1,"sheela");
		h.put(2, "Sundari");
		h.put(3,"nil");
		h.put(5, "null");
		h.put("ih",33);
		h.put(0, null);
		h.put(1,"sheela");
		h.put(true,5.5);
		System.out.println(h);
		
		LinkedHashMap l=new LinkedHashMap();
		l.put(1, "sheela");
		l.put(2, "sundarei");
		l.put(3, "subdro");
		l.put(null, 239);
		l.put("kela",-5);
		l.put(true, 5.55);
		System.out.println(l);
		 
		TreeMap t=new TreeMap();
		t.put(1, 22);
		t.put(2, l);
		//t.put(t, l);
	 //  t.put(null, "jjiji");
		//t.put('h',11);
		t.put(14, null);
		t.put(0, 10.5);
		t.put(-23, true);
		t.put(30, "sehel");
		System.out.println(t);
		
		
		
	}

}
