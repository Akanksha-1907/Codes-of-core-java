package constructor;

public class user_defined_constructor_without_parameter 
{
	int a;
	int b;
	
	//user defined constructor without parameters
	
	user_defined_constructor_without_parameter()
	{
		a=50;
		b=74;
	}
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		user_defined_constructor_without_parameter obj=new user_defined_constructor_without_parameter ();
		obj.add();
		
		//call from another class
		user_defined_constructor_without_parameter1 obj3=new user_defined_constructor_without_parameter1();
		obj3.subs();
		obj3.multi();
		obj3.div();
		
	}
}
