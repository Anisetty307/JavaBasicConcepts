package AccessModifiers;

public class Static {
	static int m=10;
	int n=0;
	public Static() {
		m=m+1;
		n++;
	}
	public static void main(String[] args) {
		Static test = new Static();
		Static test2 = new Static();
		Static test3=new Static();
		
		System.out.println(test.m);
		System.out.println(test.n);
		System.out.println(test3.n);
	}

}
