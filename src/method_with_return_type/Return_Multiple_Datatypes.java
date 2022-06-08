package method_with_return_type;

public class Return_Multiple_Datatypes
{
	//Method 1. --->returns float value
	
	public float m1()
	{
		float f=82.36f;
		return f;
		
	}
	
	//Method2.--->returns boolean value
	
	public boolean m2() 
	{
		boolean b=true;
		return b;
		
	}
	
	//Method 3.--->returns char value
	
	public char m3()
	{
		char c='T';
		return c;
	}
	
	public static void main(String[] args)
	{
		Return_Multiple_Datatypes obj=new Return_Multiple_Datatypes();
		float l=obj.m1();
		System.out.println(l);
		
		System.out.println(obj.m2());
		
		char r=obj.m3();
		System.out.println(r);
		
	}

}
