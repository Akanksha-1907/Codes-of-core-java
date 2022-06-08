package constructor;

public class default_constructor 
{
	
	//default constructor --->provided by the compiler.
	//use-->to copy all the members of class into object after object creation.
	
	/*default_constructor()
	{
		syntax of defaut constructor...which we do not have to write...it is directly given by compiler.
	}*/
	
	public void m1()
	{
		System.out.println("Running the m1 method.");
	}
	
	public static void main(String[] args)
	{
		default_constructor obj=new default_constructor();
		
		//meaning of the syntax--
		//default_constructor--->classname--->datatype(in terms of constructor)
		//obj--->objectname---->identifier for your object
		//new---->keyword---->to create a blank/empty object
		//default_constructor()----->constructor--->to copy all the members of class to empty object.
		
		obj.m1();
	}

}
