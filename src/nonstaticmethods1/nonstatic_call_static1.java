package nonstaticmethods1;

public class nonstatic_call_static1
{
	//non-static method
	
		public void uber()
		{
			System.out.println("Happy journey!");
		}
		
		//static method
		// We can give object in static when we have to call the non-static in same class.
		
		public static void gola()
		{
			nonstatic_call_static ride=new nonstatic_call_static();
			ride.uber();
		}
		
		//main method
		public static void main(String[] args)
		{
			nonstatic_call_static1 bnm=new nonstatic_call_static1();
			bnm.uber();
			
			
			
			
		}
		
		

	

}
