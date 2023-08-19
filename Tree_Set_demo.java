package collection;

import java.util.TreeSet;

public class Tree_Set_demo {

	public static void main(String[] args) {
		
		// interview  qusition 
		// error occur -- ClassCastException
		
		TreeSet hs = new TreeSet(); 
		
		  hs.add(true); 
		  hs.add(10); 
		  hs.add(5.4f); 
		  hs.add("abcd");
		  hs.add('c');
		 
		  

		hs.add("Subramani");
		hs.add("Sneka");
		hs.add("Ram_kumar");
		hs.add("Kabil_dev");
		
		 System.out.println(hs);
		
		

	}

}
