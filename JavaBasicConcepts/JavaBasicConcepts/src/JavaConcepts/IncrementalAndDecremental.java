package JavaConcepts;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i=1;
	int j=i++; //post incremental 
	System.out.println(i);		
	System.out.println(j);
	
	int a=1;
	int b=++a; // pre incremental
	System.out.println(a);		
	System.out.println(b);
	
	int m=2;
	int n=m--;  // post decremental 
	System.out.println(m);		
	System.out.println(n);		
	
	int p=2;
	int q=--p;  // pre decremental 
	System.out.println(p);		
	System.out.println(q);		
	
	
	}

}
