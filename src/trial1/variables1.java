package trial1;

public class variables1 
{
	static int a;
	int b;
	
	variables1()
	{
		int a=14;
		int b=45;
		System.out.println(a+b);
	}
	variables1(int c,int d)
	{
		a=c;
		b=d;	
	}
	public void m1()
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) 
	{
		variables1 obj=new variables1();
		variables1 obj1=new variables1(2,4);
		obj1.m1();
		
		
	}

}
