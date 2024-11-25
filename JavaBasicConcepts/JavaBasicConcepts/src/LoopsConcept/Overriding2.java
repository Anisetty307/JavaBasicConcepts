package LoopsConcept;

class vehicle
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class bike extends vehicle
{
	void run() 
	{
		System.out.println("Bike is running");	
	}
}

public class Overriding2 {

	public static void main(String[] args) {
	
		vehicle vobj=new vehicle();
		vobj.run();
		
		bike bobj=new bike();
		bobj.run();

	}

}
