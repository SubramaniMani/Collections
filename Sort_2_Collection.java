package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_2_Collection   
{

	public static void main(String[] args) {
		Mobile_collection m1 = new Mobile_collection("Sony", 20);
		Mobile_collection m2 = new Mobile_collection("Apple", 25);
		Mobile_collection m3 = new Mobile_collection("Samsung", 28);
		Mobile_collection m4 = new Mobile_collection("Vivo", 12);
	    
	    ArrayList<Mobile_collection> mobilesList = new ArrayList<Mobile_collection>(); 
	    mobilesList.add(m1);
	    mobilesList.add(m2);
	    mobilesList.add(m3);
	    mobilesList.add(m4);
	    System.out.println(mobilesList);
	  
	   // Collections.sort(mobilesList);
	   // System.out.println(mobilesList);
	  
	    

	}

}
