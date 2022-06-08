package constructor;

public class user_defined_constructor_without_parameter1
{
	int c;
	int d;
	
	user_defined_constructor_without_parameter1()
	{
		c=60;
		d=40;
	}
	public void subs()
	{
		System.out.println(c-d);
	}
	public void multi()
	{
		System.out.println(c*d);
	}
	public void div()
	{
		System.out.println(c/d);
	}
	public static void main(String[] args) 
	{
		user_defined_constructor_without_parameter1 obj1=new user_defined_constructor_without_parameter1();
		obj1.subs();
		obj1.multi();
		obj1.div();
		
		//call from another class
		user_defined_constructor_without_parameter obj2=new user_defined_constructor_without_parameter();
		obj2.add();
		
	}

}
