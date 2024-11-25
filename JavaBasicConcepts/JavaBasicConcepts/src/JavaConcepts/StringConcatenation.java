package JavaConcepts;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//+ -->String concetenation 
   // println: is used to print in the console with new line 
	// print:is just used to print in the console	 
		
	int a=100;
	int b=200;
	
  String x="Hello";
  String y="world";
  String z="ravi";
  System.out.println("test "+x.concat(" "+y+""+" "+z));
  System.out.println("test "+x+" "+y+""+" "+z);
  System.out.println(a);
  System.out.println(a+b);
  System.out.println(x+y);
  System.err.println(a+x);
  System.out.println(a+b+x+y);
  System.out.println(x+y+a+b);
  System.out.println(a+x+b+y);
  System.out.println(b+y+a+x);
	
  System.out.println("value of a is "+a);
  System.out.println("value of a+b is "+a+b);
  System.out.println("value of a+b is "+(a+b));
  
  //difference b/w print & println
  System.out.print("Hello");
  System.out.println("RAVI");
  System.out.print("kanth");
  System.out.println("devi");
  
	}

}
