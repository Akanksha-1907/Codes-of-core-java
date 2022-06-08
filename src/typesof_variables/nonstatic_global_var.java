package typesof_variables;

public class nonstatic_global_var 
{
	int r=45;                      //non-static variable
	
	public static void d()
	{
		//non-static variable in static method
		nonstatic_global_var obj=new nonstatic_global_var();
		obj.r=45;   
		System.out.println(obj.r);   //syntax--> objectname.variablename
		
	}
	public void k()
	{
		System.out.println(r);
	}
	public static void main(String[] args) 
	{
		nonstatic_global_var obj1=new nonstatic_global_var();
		obj1.k();
		d();
		
		System.out.println(static_global_var.a);
		
		nonstatic_global_var obj2=new nonstatic_global_var();  //we can create multiple objects
		obj2.r=85;
		System.out.println(obj2.r);
		
		//different class--> nonstatic method call
		static_global_var obj3=new static_global_var();
		obj3.m1();
		
	}
}
