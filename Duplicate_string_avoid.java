package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate_string_avoid {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("you");
	    al.add("Subramani"); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Swetha"); //I love Java I love India
	    al.add("you");
	    
	    HashSet hs = new HashSet();
	    
	    for(Object ob: al)
	    {
	      boolean added = hs.add(ob);
	      if(added == false)
	      {
	        System.out.println(ob);
	      }
	    }
	}

}
