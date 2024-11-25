package ConditionalStatement;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int Day=5;
       switch (Day) {
       
       case 1: System.out.println("Monday"); break;
       case 2: System.out.println("Thuesday"); break;	  
       case 3: System.out.println("Wednesday"); break;
       case 4: System.out.println("Thurday"); break;
       case 5: System.out.println("Friday"); break;
       case 6: System.out.println("Saturday"); break;
       default: System.out.println("None of the above");
    	   
    	 // if you didn't give break method then remaining cases also will print.  
      }
       
   }
}