package OopsConcepts;

public class StaticAndNonStatic {

       // scope of Global variable Available across the function with some condition (Depend on static and non static) 
	    String s="Tom";  //Non static global variable
        static int age=15;	//static global variable	
	
	
	public static void main(String[] args) {
		
		//how to call static method & variable.
		//1.direct calling.
		sum();
		//2.calling by class name.
		StaticAndNonStatic.sum();
  
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		
		//how to call non static method 
		StaticAndNonStatic Obj=new StaticAndNonStatic();
		Obj.nonsum();
		System.out.println(Obj.s);
		
		//Can we call static method by Object reference ? Yes, We can call 
		Obj.sum();
		  
		}

	public void nonsum() {//non static method 
		System.out.println("non static method");
		
	}
	 
	public static void sum() { //static method
		System.out.println("static method ");
	}
	
}
