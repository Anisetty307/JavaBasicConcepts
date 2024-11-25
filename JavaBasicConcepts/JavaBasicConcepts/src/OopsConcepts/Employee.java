package OopsConcepts;

public class Employee {
	
	int empid;
	String Empname;
	int salary;
	int depno;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(Empname);
		System.out.println(salary);
		System.out.println(depno);
	    System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp1=new Employee();   /// 1st employee
    emp1.empid=7;
    emp1.Empname="RAVI";
    emp1.salary=2000;
    emp1.depno=324;
    emp1.display();
    
    Employee emp2=new Employee();    ///2nd employee
    emp2.empid=8;
    emp2.Empname="SAI";
    emp2.salary=3000;
    emp2.depno=384;
    emp2.display();
    	
		
		
		
	}

}
