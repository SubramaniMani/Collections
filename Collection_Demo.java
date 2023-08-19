package collection;

import java.util.ArrayList;

public class Collection_Demo {

	public static void main(String[] args) {
		
		String input = "i love java , java is one of the easiest programming languages. Java has more inbuilt libraries";
	   // System.out.println(input);
	    String output = input.replace("java", "python");
	    //System.out.println(output);

	    ArrayList al = new ArrayList(); 
	    String[] str = input.split(" "); // split method using for one one letter 
	    for(String st: str)
	    {
	      if(st.equals("java"))
	        al.add("Python");
	      else
	        al.add(st);
	    }
	    System.out.println(al);
	}

}
