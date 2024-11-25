package OopsConcepts1;

public class TestCar {

	public static void main(String[] args) {
	
		//static polymorphism -- compile-time polymorphism
		//one to many method  
		
		BMW b=new BMW();
	    b.start();
	    b.stop();
	    b.refuel();
	    b.theftsafety();
	    b.engine();
	    
	    
		
     System.out.println("-------");
	    
	    Car c= new Car();
	    c.start();
	    c.stop();
	    c.refuel();
	   // c.refuel() ;  parent class can not be inheritance the child class 
	    c.engine();
	    System.out.println("-------");
	    
	    
	    //Top -casting 
	    Car c1= new BMW(); //Child class object can be referred by parent class reference variable
	                       //Dynamic polymorphism-- run time polymorphism
	    	c1.start();   ///method overridden method applies 
	    	c1.stop();
	    	c1.refuel();
	    	c1.engine();
	       
	    	
	    //Down casting 
	    	
	    	BMW b1=(BMW)new Car();   //Class cast exception
	    	
	    	
	    
	}

}
