package AccessModifiers;

public class demo {
	

    static int a=10;
		int b=20;
		
		static void  test() {
		System.out.println(a);
	//	System.out.println(b);	
		}

		void test2() {
		System.out.println(a);
		System.out.println(b);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	//	test2();
		demo tt=new demo();
		tt.test2();
	    

		demo obj1=new demo();
		demo obj2=new demo();
		demo obj3=new demo();
		
//		obj1.a=50;
//	obj2.b=60;
		
		obj1.a=80;
		obj1.a=100;
		obj1.b=110;
		obj1.b=120;
		obj2.a=789500;
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	//	obj1.a=80;
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	//	obj1.a=100;
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		
		
		
	}

}
