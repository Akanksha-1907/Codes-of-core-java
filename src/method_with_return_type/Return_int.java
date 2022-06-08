package method_with_return_type;

public class Return_int 
{
	//method with return type.
	//create a method that should return integer value.
	
	public int m1()
	{
		int a=20;				//can directly write return 20;
		return a;				
	}

	public static void main(String[] args) 
	{
		//we use this method to print because we can use this value multiple times for further use.Ex-->
		//Return_int obj=new Return_int();
		//int b=obj.m1();
		//int c=15;
		//System.out.println(b+c);
		
		
		Return_int obj=new Return_int();
		int b=obj.m1();
		System.out.println(b);
		
		//or --->for printing we can also write
		
		System.out.println(obj.m1());
		
	}
}
