package typesof_variables;

public class static_global_var
{
	static int a=40;          //static variable
	
	public void m1()
	{
		System.out.println(a);     //since we are using static variable ,we do not need to create object here. 
	}
	public static void m2()
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		static_global_var obj=new static_global_var();   //to call nonstatic method,we created object
		obj.m1();
		m2();
		
		
	}
}
