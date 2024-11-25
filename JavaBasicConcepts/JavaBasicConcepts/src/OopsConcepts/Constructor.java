package OopsConcepts;

public class Constructor {
    
	int empid;
	String Empname;
	int salary;
	int depno;
	
	
	Constructor(int empid,String Empname,int salary,int depno)
	{
		this.empid=empid;        //empid=id;     //Constructor(int id,String name,int sal,int dno)        
		this.Empname=Empname;         //Empname=name;
		this.salary=salary;           //salary=sal;
		this.depno=depno;	          //depno=dno;
	}
	
	Constructor(int empid,String Empname)
	{
		this.empid=empid;
		this.Empname=Empname;
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(Empname);
		System.out.println(salary);
		System.out.println(depno);
	    System.out.println();
	}

	// Assigning values to class variable using constructor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor emp1=new Constructor(33,"ravi",1000,54);
		emp1.display();
		
		Constructor emp2=new Constructor(32,"sai",7000,58);
		emp2.display();
		
		Constructor emp3=new Constructor(34,"prakash");
		emp3.display();
		
		
		
		
	}

}
