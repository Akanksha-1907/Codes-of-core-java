package nonstaticmethods1;

public class nonstatic_call_static 
{
	//non-static method
	
	public void uber()
	{
		System.out.println("Happy ride!");
	}
	
	//static method
	// We can give object in static as well as non-static in same class.
	
	public static void ola()
	{
		nonstatic_call_static ride=new nonstatic_call_static();
		ride.uber();
	}
	
	//main method
	public static void main(String[] args)
	{
		ola();
		
	}
	
	

}
