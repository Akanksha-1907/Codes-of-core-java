package nonstaticmethods1;

public class static_call_nonstatic 
{
	public static void daisy()
	{
		System.out.println("Flower samjhe kya?");
	}
	
	public void rose()
	{
		daisy();
		System.out.println("Fire hai mai!");
		
	}
	public static void main(String[] args) 
	{
		static_call_nonstatic fire=new static_call_nonstatic();
		fire.rose();
		
		
	}

}
