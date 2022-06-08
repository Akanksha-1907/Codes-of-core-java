package nonstaticmethods1;

public class nonstatic_call_nonstatic 
{
	public void lotus()
	{
		System.out.println("Happy & Grateful");  //////non static method
	}
	public void jasmine()                        ////non static method
	{
		System.out.println("Overwhelmed");
		lotus();
	}
	public static void main(String[] args) 
	{
		nonstatic_call_nonstatic opi=new nonstatic_call_nonstatic();
		opi.jasmine();
		
	}

}
