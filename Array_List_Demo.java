package collection;

import java.util.ArrayList;

public class Array_List_Demo {

	public static void main(String[] args) {
		
		
		ArrayList object = new ArrayList();
		
		object.add("Subramani");
		object.add("Swetha");
		object.add(143);
		object.add(2000);
		System.out.println(object); 
		object.add(2002);
		System.out.println(object);
		object.add(2,"Iloveu");
		System.out.println(object);
		object.remove(3);
		System.out.println(object);
		System.out.println(object.contains("Swetha")); // there  // return type boolean true or false 
		System.out.println(object.contains("Ram"));  // not there
		System.out.println(object.get(0));  // postion print  // return type element
		System.out.println(object.indexOf("Swetha")); // index position
		System.out.println(object.indexOf(2000)); // index position  // return type int
		object.add("Subramani");
		System.out.println(object);
		System.out.println(object.lastIndexOf("Subramani")); // its last position print // return type int  
		System.out.println(object.isEmpty()); // array list empty check // Return type boolean
		
		
		ArrayList object1 = new ArrayList(); // new object create 
		
		object1.addAll(object);
		System.out.println(object1);
		
//		object1.add("subramani");
//		object.add("Swetha");
//		object1.add("Iloveu");
//		object1.add(2000);
//		object1.add(2002);
//		object1.add("Sneka");
//		object1.add("Subramani");
		
		  object1.add("Ramkumar");
		  object1.add("subramani");
		  object1.add("Dharani");
		  object1.add("Sneka"); 
		  object1.add("Kabil"); 
		  object1.add("Santhiya");
		  object1.add("Santhosh"); 
		  object1.add("Sheik");
		 
		System.out.println("Object1---->"+object1);
		object1.remove(2);  // remove particular position
		System.out.println(object1);
		
		System.out.println(object1.containsAll(object));
		
		object1.retainAll(object); // first array only show 
		System.out.println(object1);
		object.retainAll(object1);
		System.out.println(object);
		object1.removeAll(object);  // remove all index element
		System.out.println(object1);
		object.set(4, "Sudha");
		System.out.println(object);
		System.out.println("Size of array ->"+object.size());
		Object[] ar = object.toArray();//to Array is used to convert Whole ArrayList INTO ARRAY
		
		
		for (Object object2 : ar) {
			System.out.println(object2);
		}
		
		
		
	}

}
