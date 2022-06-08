package nonstaticmethods1;

public class nonstatic_call_nonstatic1 
{
	public void purple(String f)        //non static method
	{
		System.out.println(f);
	}
	
	public void pink()					//non static method
	
	{
		purple("Lehenga");
		nonstatic_call_nonstatic obj=new nonstatic_call_nonstatic();
		obj.jasmine();
	}

	public static void main(String[] args) 
	{
		nonstatic_call_nonstatic1 jeans=new nonstatic_call_nonstatic1();
		jeans.pink();
		
	}
}
