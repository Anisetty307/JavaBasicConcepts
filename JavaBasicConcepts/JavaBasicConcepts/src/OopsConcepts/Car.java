package OopsConcepts;

public class Car {

	//Car is the class
	// Car variables 
	   int mod;        // mod/wheel are global variables or class variables 
	   int wheel;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Car a=new Car();          // new car() is the Object and a,b,c, is the Object the reference variable
	 Car b=new Car();          //new keywords is used to create  the object.
	 Car c=new Car();
	 
	 a.mod=2015;
	 a.wheel=4;
	 
	 b.mod=2014;
	 b.wheel=3;
	 
	 c.mod=2013;
	 c.wheel=2;
	 
	 System.out.println("Before shifting the reference");
	 
	 System.out.println(a.mod);
	 System.out.println(a.wheel);
	 
	 System.out.println(b.mod);
	 System.out.println(b.wheel);
	 
	 System.out.println(c.mod);
	 System.out.println(c.wheel);
	 
	 System.out.println("After shifting the reference");
	 
	 a=b;
	 b=c;
	 c=a;
	 
	 c.mod=10;
	 System.out.println(c.mod);
	 c.mod=20;
	 System.out.println(a.mod);
	 System.out.println(c.mod);
	 
	 
		
	}
	 
	}


