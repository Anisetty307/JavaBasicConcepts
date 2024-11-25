package JavaConcepts;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array: To store the similar data types values in a array variable 
		
	
		//1.int array;
		//Lowest bound/index=0
		//Upper bound/index=n-1 (n is the size of the array 
		// one dimensional array 
		
		//Dis-advantages of array
		//1. size is fixed -- static array -- to over this problem, we use the ArrayList, HashTable
		//2. store only similar data types -- to over come this problem , we use the Object array 
		
		int i[]=new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
	    System.out.println(i[3]);
	    System.out.println(i[2]);
	    System.out.println("For each loop");
	 
	//    For each loop 
	    for(int j:i) {
	    	System.out.println(j);
	    }
	    
	    
	 //  System.out.println(i[4]); , we get the error as ArrayIndexOutOfBoundsException.
	                                                         
	    System.out.println(i.length); //size/length of array.
	    
	    //print the all values of array; use for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
	//Other format array   
		for(int r=0;r<=3;r++) {
		  System.out.println(i[r]);
		}
			
		
	//2.double array
		double d[] =new double[4];
		d[0]=5.22;
		d[1]= 7.23;
		d[2]= 1.22;
		d[3]= 8.33;
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		
    //3. char Array
		char c[]=new char[3];
		c[0]='r';
		c[1]=3; // if we declare integer  array then does not appear in console
		c[2]='u';
		System.out.println(c[2]);
		
		//4.Boolean array 
		boolean b[]=new boolean[2];
		 b[0]=true;
		 b[1]=false;
		 System.out.println(b[1]);
		 
		 //5. string Array ;
		String s[]=new String[3];
		 s[0]="hello";
		 s[2]="ravi";
		 s[1]="Kanth";
		 System.out.println(s[2]);
				
		//6.Object array :(Object is the class) -- is used to store the different data types values
		 Object ob[]=new Object[5];
		 ob[0]="Ravi";
		 ob[1]=4;
		 ob[2]='M';
		 ob[3]=3.22;
		 System.out.println(ob[3]);
		 System.out.println(ob.length);
		 
				
		
	}

}
