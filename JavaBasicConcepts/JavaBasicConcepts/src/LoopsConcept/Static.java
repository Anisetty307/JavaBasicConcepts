package LoopsConcept;

public class Static {
	
	int a;  // Non -static 
	static int b;   // static 
	
	static void m1()   // static method 
	{
		System.out.println("This is static method m1");
	}
	
	void m2()   // non-static method 
	{
		System.out.println("This is non static method m2");
	}
   
	void m3()   //non- static 
	{
		a=500;  // non-static variable
		b=1000;   // static variable
		
		m1();
		m2();
	}

	public static void main(String[] args)   //static method 
	{
		
		b=100;
		System.err.println(b);
		m1();
		
		//a=200;  // not accessible, becoz it is non static variable
		//m2();   // not accessible, becoz it is static method
		
		Static se=new Static();
		se.a=200;
		System.out.println(se.a);
		se.m2();
		se.m3();
		
		
	}

}
