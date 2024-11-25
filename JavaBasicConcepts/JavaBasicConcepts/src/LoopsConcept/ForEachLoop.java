package LoopsConcept;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i[]=new int[4];    // Declare in another way 
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40; */
        int i[]={10,20,30,40};
	    System.out.println("For each loop");
	 
	//    For each loop 
	    for(int j:i) {
	    	System.out.println(j);
	   }
	    
	    
	    System.out.println("total values");
	// total value of all integers 
	    int sum=0;
	    for(int j:i) {
	    //	System.out.println(j);
	    	sum=sum+j;  
	    	System.out.println(sum);
	    }
	    
	}
	
	

}
  