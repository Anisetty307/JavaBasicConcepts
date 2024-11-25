package AccessModifiers;


class A 
{
	//private int i=10;   -- only with in the class
	// private void m1() {
	//	System.out.println(i);
	
	
	//default modifier   -- Access with in the package
	int i=10;
    void m1() {
	System.out.println(i);
	
	
	}
}

public class AccModi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A aobj=new A();
		aobj.i=10;  // Cannot access  if it is private 
		aobj.m1();  // Cannot access  if  it is private
		
		
		
		
	}

}
