package JavaConcepts;

public class ConstructorConcept {
	
	//String name;
	//int age;
	
	///Can we overload constrcutor -- yes, we can over load 
	public ConstructorConcept() { //0 parameters
		System.out.println("Default Const");
	}
    public ConstructorConcept(int i) { //1 parameter
    	System.out.println("1 param");
    	System.out.println(i);	
    }

    public  ConstructorConcept(int i, int j) { // 2 param
    	System.out.println("2 param");
    	System.out.println(i+" "+j);
    }
    
    public ConstructorConcept(String name, int age) {
    	//this.name= name;  // this.class var = local var 
    	//this.age=age;
    	//name=name1.
    	//age=age1
    	System.out.println(name);
		System.out.println(age);
    }
    
    
    
	public static void main(String[] args) {
		ConstructorConcept obj =new ConstructorConcept();
		ConstructorConcept obj1 =new ConstructorConcept(10);
		ConstructorConcept obj2 =new ConstructorConcept(10,5);
		ConstructorConcept obj3 =new ConstructorConcept("Tom",25);
		
	//	System.out.println(obj3.name);
	//	System.out.println(obj3.age);
	}

}
