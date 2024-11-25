package OopsConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="100";
		System.out.println(x+20); 
		
	//integer .doub;le , character,boolean 
		
		//data conversion string to int
		 int i= Integer.parseInt(x);
		 System.out.println(i+20);
		 
		 //string to double conversion
		 String y="12.22";
		 double d=Double.parseDouble(y);
		 System.out.println(d+10);
	
		 //string to Boolean.
		 String a="true";
		boolean z= Boolean.parseBoolean(a);
		System.out.println(z);
		
		//int to string
		  int j=200;
		  System.out.println(j+10);
		String M=String.valueOf(j);  //"200"   ///Imp to remember in interview 
		System.out.println(M+20);
		
		String u ="100N";
		Integer.parseInt(u);   // if we want convert string to integer but string is not a pure integer then 
		                       // you get the number format exception.  --input string=100N  
		
		
	}

}
