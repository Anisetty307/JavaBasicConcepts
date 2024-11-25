package JavaConcepts;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h=new Hashtable();
		
	     h.put("A","Test");
	     h.put("B","Hello");
	     h.put("C", "ravi");
	     
	     System.out.println(h.size());
	     h.put(1,100);
	     h.put(2,200);
	     h.put(3,300);
	     Set set = h.keySet();
	     System.out.println(set.toString());
	     Set set1= h.entrySet();
	     System.out.println(set1.toString());
	     
	     System.out.println("******");	    
	      
	      
	     System.out.println(h.size());
	     System.out.println(h.get(2));
	     System.out.println(h.get("C"));
	    
	     h.put(3,"SAI");  // we can give any combination in the put method
	     
	     Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
	     h1.put(4,400);
	    //  h.put("A", 300);  Accept only integer key & integer value.
	     
	     
	    
		
		
	
		}

}
