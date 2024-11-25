package OopsConcepts1;

public class HSBCBank  implements USBank,BrazilBank {
	 //Is-a Relation ship
	
	//If class implementing any interface , then its mandatory to define/override all the method of interface
	//override from USBank
		public void credit() {
		System.out.println("HSBC---CREDIT");
	}	
	public void debit() {
		System.out.println("HSBC-----debit");
	
	}
  public void tranferMoney() {
	  System.out.println("HSBC----tranfermoney)");
  }
  
  //Separate method of HSBC bank
  public void educationLoan() {
	  System.out.println("HSBCB---educationloan");
  }
	
  public void CarLoan() {
	  System.out.println("HSBC---Car Loan");
  }
  
  //brazil bank method
  public void MutualFund() {
	  System.out.println("HSBC---mutual fund");
	  
  }
  
  
}
