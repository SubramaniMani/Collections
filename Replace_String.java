package collection;

import java.util.ArrayList;

public class Replace_String {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    boolean present = al.contains("Java");
	    System.out.println(present);
	    if(present==true)
	    {
	      int position = al.indexOf("Java");
	      System.out.println(position);
	      al.set(2, "python");
	    }
	    System.out.println(al);

	}

}
