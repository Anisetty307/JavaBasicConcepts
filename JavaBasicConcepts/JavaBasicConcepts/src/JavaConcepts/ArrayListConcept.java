package JavaConcepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
	//Array: Arrays are fixed size of collection of elements
    // Array List : ArrayList are dynamic and resizable collections of elements.		
		
		
		ArrayList ar=new ArrayList();
		 ar.add(100);  //0 index
		 ar.add(200);  //1 index
		 ar.add(300);  //2 index
		 
		System.out.println(ar.size());
		
		ar.add(400);   //3 index
		ar.add(500);   //4 index
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		ar.add("tom");  //5 index
		ar.add("ravi");  //6 index
		ar.add(77.33);   //7 index
		ar.add("G");   //8 index
		
		System.out.println(ar.size());
		ar.remove(8);     /// add & remove are methods.
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
		// System.out.println(ar.get(9)); -- will get indexOutOfBoundsException
		
		//To print all values of array list : use for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
	   ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
	//	ar1.add("RAVI1");
		System.out.println(ar1.get(1));
		//ar1.add("Tom");  Accept only integer values
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Sai");
		//ar2.add(100);  accept only string values
	
		
		
		
		
		
	}

}
