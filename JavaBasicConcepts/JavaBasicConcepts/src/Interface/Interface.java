package Interface;

interface Testinter
{
	int a=10;   // by default variable is static and final
	void display();   // abstract method
}

public class Interface implements Testinter{
	
   public void display()
   {
	   System.out.println(a);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface ie=new Interface();
		ie.display();

	}

}

