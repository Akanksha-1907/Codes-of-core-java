package constructor;

public class with_parameters 
{
	
	//parameterized constructor
	
	int num1;           //global variables
	int num2;			//global variables
	
	with_parameters(int a,int b)			//local variables
	{
		num1=a;
		num2=b;
	}
	public void add()
	{
		int c=num1+num2;
		System.out.println(c);
		
	}
	public static void main(String[] args) 
	{
		//call from same class
		
		with_parameters obj=new with_parameters(2,4);
		obj.add();
		
		//call from another class
		
		with_parameters1 obj1=new with_parameters1(80,4);
		obj1.multi();
		
	}

}
