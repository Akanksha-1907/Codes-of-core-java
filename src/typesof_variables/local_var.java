package typesof_variables;

public class local_var 
{
	public void a1()
	{
	//we cannot use this variable in different method.We have to use this within this method only.
		int v=12;
		System.out.println(v);
		b1();//call to static method in non-static method. 
		
	}
	public static void b1()
	{
	//but we can create variable of same name but in different method.
		int v=15;
		System.out.println(v);
	}
	public static void main(String[] args) 
	{
		local_var abc=new local_var();
		abc.a1();
		b1();
		
	}
	//we can call one method in another method.

}
