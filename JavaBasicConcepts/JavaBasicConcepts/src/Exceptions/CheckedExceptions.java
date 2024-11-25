package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		System.out.println("Program Inprogress");
		
	
		Thread.sleep(5000);
		
		FileInputStream file=new FileInputStream("C:\\docu\file....");
		
		
		/*	try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}*/
		
		System.out.println("Program Completed");
	}

}
