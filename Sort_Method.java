package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Method {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Collections.sort(al);
		
		/*
		 * al = new ArrayList();
		 * 
		 * al.add("Abcd"); al.add("Efgh"); al.add("Pqrs"); al.add("Zbcd");
		 * 
		 * Collections.sort(al);
		 * 
		 * System.out.println(al);
		 */
		System.out.println(al);
		
		

	}

}
