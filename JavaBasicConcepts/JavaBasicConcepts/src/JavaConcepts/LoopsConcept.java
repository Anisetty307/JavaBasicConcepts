package JavaConcepts;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    // while loop		
    // disadvantage of while loop'; it will generate infinite loop if you don't give incremental/decreamental part
		int i=1;   //initialization
		while(i<=10) {  //conditional
			System.out.println(i);
			i=i+1;  // incremental/decremental
		}
	
	System.out.println("*********");	
		
	// for loop                //initialization,conditional, incremental 
	for(i=1;i<=20;i++) {
		System.out.println(i);
	}
	
	System.out.println("*********");
	
	for(i=10;i>=-10;i--) {     //initialization,conditional, incremental
		System.out.println(i);
	}
	
	}

}
