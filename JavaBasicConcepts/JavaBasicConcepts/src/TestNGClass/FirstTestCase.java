package TestNGClass;

import org.testng.annotations.Test;

public class FirstTestCase {

	
	@Test
	void openurl()
	{
		System.out.println("Opening the url");
	}
	
	@Test
	void login() 
	{
	System.out.println("Login into the Application");	
	}
	
	@Test
	void logout()
	{
	  System.out.println("Login out from Application");	
	}
}
