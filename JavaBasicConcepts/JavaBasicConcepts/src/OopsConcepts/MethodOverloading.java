package OopsConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading Obj=new MethodOverloading();
		Obj.sum();
		Obj.sum(2);
		Obj.sum(10, 5);
		
	}
	
	public static void main(int p) {
		System.out.println("MethodOverloading.main()");
	}
	public static void main(double q) {
		System.out.println(q);
	}
	
	// we can overload main method also.
    //You can not create method inside the method.
	//Duplicate method: same method name with same number of arguments are not allowed.
	
	
	//Method overloading:when method name is same with different arguments or input parameter and with different data types
	public void sum() { //Zero input parameter
		System.out.println("sum method with zero parameter");
	}
	
	public void sum(int i) {  //One input parameter
		System.out.println("sum method with one parameter");
		System.out.println(i);
	}
	
	public void sum(int p, int i) {  /// two input parameter
		System.out.println("sum method with two parameter");
		System.out.println(p+i);
	}
	
}
