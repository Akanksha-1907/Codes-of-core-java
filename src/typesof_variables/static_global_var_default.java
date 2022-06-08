package typesof_variables;

public class static_global_var_default 
{
		static String a;
		
		public void m1()
		{
			System.out.println(a); 
			//since we are using static variable ,we do not need to create object here. 
		}
		public static void m2()
		{
			System.out.println(a);
			
		}
		public static void main(String[] args) 
		{
			System.out.println(a);
			static_global_var_default obj=new static_global_var_default();   //to call nonstatic method,we created object
			obj.m1();
			m2();
			
		}
	}



