package OopsConcepts;

public class EmployeeM2 {
	int empid;
	String Empname;
	int salary;
	int depno;
	
	
	void setdata(int id,String name,int sal,int dno)
	{
		empid=id;
		Empname=name;
		salary=sal;
		depno=dno;	
	}
	
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

		EmployeeM2 emp1=new EmployeeM2();
		emp1.setdata(23,"surya",3000,5);
		emp1.display();
		
		EmployeeM2 emp2=new EmployeeM2();
		emp2.setdata(27,"devi",1000,2);
		emp2.display();
		
		
	}

}
