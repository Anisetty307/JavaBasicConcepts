package OopsConcepts1;

public interface USBank {

     int min_bal=100;
	
    public void credit();
    
    public void debit();
    
    public void tranferMoney();
    
    //Only method declaration 
    // no method body - only method prototype
    // in interface , we can declare the variables, variables are by default static in nature 
    // variable value will not be changed, it final/constant in nature.
    // no static method in interface.
    //No main method in interface 
    // we can not create the object of interface
    // Interface in abstract in nature 
    
}
