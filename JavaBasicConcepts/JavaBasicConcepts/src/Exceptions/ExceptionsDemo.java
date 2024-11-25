package Exceptions;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program started");
		
		Scanner sc=new Scanner(System.in);
		
	//	Exmaple:1
	 /*   System.out.println("Enter a number");
		int num=sc.nextInt();
	    System.out.println(100/num);    //ArithmeticException
		*/

     //Example2
		/*int a[]=new int[5];
		System.out.println("Enter the position(0-4)");
        int pos=sc.nextInt();
        System.out.println("Enter a value");
		int value=sc.nextInt();
		
		a[pos]=value;
		
		System.out.println(a[pos]);   // ArrayIndexOutOfBoundsException
		*/
		
		
		// Example:3 
		/*String s="WELCOME";
		int num=Integer.parseInt(s);
	    System.out.println(num);     // NumberFormatException
		*/
		
		
		// Example: 4
		String s=null;
		System.out.println(s.length());   // NullPointerException
		
		
		
		System.out.println("Program Completed");
		
		
		
	}

}
