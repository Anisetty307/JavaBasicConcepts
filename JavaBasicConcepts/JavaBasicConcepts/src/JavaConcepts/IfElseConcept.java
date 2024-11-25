package JavaConcepts;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;

  if (a>b)	{	
	  System.out.println("a is greater then b");
  }else {
	  System.out.println("b is greater then a");
  }
	
  
  // which is highest value of given  three number 
  
   int c=200;
   int d=300;
   int e=400;
   
   if(c>d & c>e) {
	   System.out.println("c is greater value");
   }else if(d>e) {
	   System.out.println("d is greater value"); 
   }else 
	   System.out.println("e is greater value");
  
		
	}

}
