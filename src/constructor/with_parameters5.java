package constructor;

public class with_parameters5 
{
	
	//example of multiple constructors in single program
	//we can use multiple contructors in single programs but the arguments which we are passing should be different.
	//Suppose for ex--->we first use a constructor without parameter then another we have to use with parameters,we cannot
	//usewithout parameter constructor again.
	//If we want to use another constructor with parameter the we have to take int and float if we have taken int and int previously.

	
	int length;
	int breadth;
	float side;
	
	//first take constructor without parameters
	
	with_parameters5()
	{
		System.out.println("calculating the area of Rectangle");
	}
	
	//now taking contructors with parameters
	
	with_parameters5 (int a,int b)
	{
		length=a;
		breadth=b;
	}
	
	//another constructor with parameter but with different arguments
	
	with_parameters5 (float c)
	{
		side=c;
	}
	public void area() 
	{
		System.out.println("Area of Rectangle= "+(length*breadth));
		
	}
	public void area1()
	{
		System.out.println("Area of Square= "+(side*side));
	}
	public static void main(String[] args)
	{
		with_parameters5 obj=new with_parameters5 ();
		with_parameters5 obj1=new with_parameters5(3,7);
		obj1.area();
		with_parameters5 obj2=new with_parameters5 (5.5f);
		obj2.area1();
		
	}
	
}
