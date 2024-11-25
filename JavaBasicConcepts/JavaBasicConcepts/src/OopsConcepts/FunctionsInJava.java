package OopsConcepts;

public class FunctionsInJava {
   //main method --> strating point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionsInJava Obj=new FunctionsInJava();
		// Object will be created, obj is reference variable, reference to this object;
		// after creating the object, Copy of all non static method given to the object.
		
		//static method 
		Obj.test();
		int ca= Obj.pqr();
		System.out.println(ca);
		
		String st=Obj.st();
		System.out.println(st);
		
		int divi=Obj.div(6,2);
		System.out.println(divi);
		
	}
		
		//Non static method 
	    // Void= does not any value 
	    // Return type is void
	 public void test() { //no Input & no output
		 System.out.println("Test method");
	 }
		
	 // Return type is int
	public int pqr() { //no input & some out put 
		System.out.println("int method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	
	}
   //  return type is string 
	public String st() { //No input & some output
    	String s="selenium";
    	 System.out.println("String method");
    	return s;
    	
    }
		
	// return type is int
	public int div(int x, int y) {  // some input and some output
		
		System.out.println("Division method");
		int d=x/y;
		return d;
		
	}

}
