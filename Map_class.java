package collection;

import java.util.HashMap;

public class Map_class {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap(); 
	    hm.put("virat", 45);
	    hm.put("dhoni", 55);
	    hm.put("rohit", 85);
	    hm.put("dhawan", 50);
	    hm.put("kapil", 100);
	    hm.put("rohit", 91);
	    hm.put("rohit", 91);
	    System.out.println(hm);
	    System.out.println(hm.keySet()); // key value print 
	    System.out.println(hm.values()); // value print 
	    
		

	}

}
