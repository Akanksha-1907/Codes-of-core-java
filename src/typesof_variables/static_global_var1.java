package typesof_variables;

public class static_global_var1 
{
	static int y=82;             //static variable
	
	public void p()
	{
		System.out.println(y);
	}
	public static void q()
	{
		System.out.println(y);
	}
	public static void main(String[] args)
	{
		static_global_var.m2();
		static_global_var1 obj1=new static_global_var1 ();
		obj1.p();
		q();
		System.out.println(static_global_var.a);    //or we can call other class like this also only in static global variables
		//syntax--> (classname.variablename)
	}
}
