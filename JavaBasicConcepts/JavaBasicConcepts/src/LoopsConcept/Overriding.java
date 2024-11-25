package LoopsConcept;

class Bank 
{
	int getrateofinterest()
	{
		return 0;
	}
}

class SBI
{
	int getrateofinterest()
	{
		return 10;
	}

}


class ICICI
{
	int getrateofinterest()
	{
		return 15;
	}

}

class AXIS
{
	int getrateofinterest()
	{
		return 20;
	}

}


public class Overriding {
	public static void main(String[] args) {
		
		SBI SOBJ=new SBI();
		System.out.println(SOBJ.getrateofinterest());
		
		ICICI IOBJ=new ICICI();
		System.out.println(IOBJ.getrateofinterest());
		
		AXIS AOBJ=new AXIS();
		System.out.println(AOBJ.getrateofinterest());

	}

}
