package LoopsConcept;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// length of the string 
		String s="Welcome";
       System.out.println(s.length());   /// 7 is number of character 
       
       //concatanation 
		
       String s1="welcome to ";
       String s2="Training";
       
       System.out.println(s1+s2);
       System.out.println(s1.concat(s2));
       System.out.println("welcome to "+"training");
       System.out.println("welcome to ".concat("training"));
	
       //Equals  -- will get the boolean values 
       String s3="WELCOME";
       String s4="welcome";
       
       System.out.println(s3.equals(s4));
       System.out.println(s3.equalsIgnoreCase(s4));
       
       // contain  -- will get the boolean values 
       
       System.out.println(s3.contains("WEL"));
       System.out.println(s3.contains("wel"));
       
       
       //substring 
       
       System.out.println(s.substring(0,3));    ///s=Welcome
       System.out.println(s.substring(3,6));
       
       //Replace 
       System.out.println(s.replace('e','a'));
       System.out.println(s.replace("come", "ravi"));
       
       
	}
	

}
