package ArayPrograms;

import java.util.HashMap;

public class D1 {

	public static void main(String[] args)
	 {
			//System.out.println("HII JAVA");
	 
			HashMap h=new HashMap();
			h.put(10,20);
			h.put(1,"sheela");
		    h.put(null,'c');
		    h.put("leela",-5);
		    h.put(true, 5.5);
		    h.put(4,"kill");
		    System.out.println("======================================");
		    //CONVERTINH HASHMAP INTO COLLETION/SET
		    
		    System.out.println("ENTRYSET:"+h.entrySet());
		    System.out.println("KEY:"+h.keySet());
		    System.out.println("VALUE:"+h.values());
		   h. remove("kill");
		    System.out.println("MAP:"+h);
		    
			
		}

}

