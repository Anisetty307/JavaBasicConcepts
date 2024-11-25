package OopsConcepts;

public class LocalVsGobalcvariable {

	//Global variable -->class variable 
		String s="tom";
		int age=12;
  
	public static void main(String[] args) {
		
		int i=5; //Local variable 
		System.out.println(i);
	//if we need to use global variable then create object and use the global variable.
		LocalVsGobalcvariable Obj=new LocalVsGobalcvariable();
		System.out.println(Obj.s);
		System.out.println(Obj.age);
		Obj.sum();
		
		
	}

	public int sum() {
		
		int i=15;  //Local variable first sum method.
		int j=25;
		System.out.println(i);
		
		return i;
	
	}
	
	
	
}
