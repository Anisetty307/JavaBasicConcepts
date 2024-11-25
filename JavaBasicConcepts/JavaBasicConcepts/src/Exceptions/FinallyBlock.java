package Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Program started");
		
		String s=null;
		
		
		try {
		System.out.println(s.length());   // NullPointerException
		}
	/*	catch(NullPointerException e)
		{
		System.out.println("NUll data");
			System.out.println(e.getMessage());
		}*/
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());  // method -getMessage() 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());   // For types of exception - super user 
		}
		finally
		{
			System.out.println("Finally method");
		}
		
	
		System.out.println("Program Completed");
	}

}
