package OopsConcepts1;

public class BMW extends Car{   // "Has-a relationship
	
	
	// Method overriding 
	//when same method is present in parent class and child class with the same name and same number of arguments
	
	public void start() { //overridden method
		System.out.println("BMW--START");
	}
   
	public void theftsafety() {
		System.out.println("BMW---theftsafety");

	}
}

 