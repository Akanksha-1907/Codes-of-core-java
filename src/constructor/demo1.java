package constructor;

public class demo1 
{
	int num1;
	int num2;
	int num3;
	
	demo1(int a,int b)
	{
		num1=a;
		num2=b;
	}
	demo1(int c)
	{
		num3=c;
		System.out.println(c);
	}
	
	public void add()
	{
		System.out.println("Addition- "+(num1+num2));
		
	}
	
	public static void main(String[] args) 
	{
		demo1 obj=new demo1(2,4);
		obj.add();
		demo1 obj1=new demo1(5);
		
		
		
	}

}
