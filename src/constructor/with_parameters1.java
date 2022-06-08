package constructor;

public class with_parameters1
{
	int num3;
	int num4;
	
	with_parameters1(int c,int d)
	{
		num3=c;
		num4=d;
	}
	
	public void subs()
	{
		System.out.println((num3-num4));
	}
	public void multi()
	{
		System.out.println((num3*num4));
	}
	public void div()
	{
		System.out.println((num3/num4));
	}
	public void modu()
	{
		System.out.println((num3%num4));
	}
	
	public static void main(String[] args)
	{
		//we can create multiple objects
		
		with_parameters1 obj1=new with_parameters1(60,4);
		obj1.subs();
		obj1.multi();
		
		with_parameters1 obj2=new with_parameters1(90,2);
		obj2.div();
		obj2.modu();
		
		
	}

}
