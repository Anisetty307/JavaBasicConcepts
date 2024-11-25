package OopsConcepts;

public class CallByValueAndCallByReff {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReff Obj=new CallByValueAndCallByReff();
		int x=10;
		int y=20;
		Obj.testsum(x,y);    //call by value or pass by value 
		
		Obj.p=50;
		Obj.q=60;
		
		Obj.swap(Obj);
		//After swap
		System.out.println(Obj.p);
		System.out.println(Obj.q);	
	}
	
	//call by value method 
	public int testsum(int a, int b) {
		a=30;
		b=40;
	 int c=a+b;
	 System.out.println(c);
	  return c;
	}

	// call by reference method
	public void swap(CallByValueAndCallByReff t) {
		int temp;
		temp=t.p; // temp=50
		t.p=t.q;  // t.q=60
		t.q=temp; // t.q=60
		
		
	}
	
}
