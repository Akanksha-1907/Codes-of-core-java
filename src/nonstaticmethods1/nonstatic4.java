package nonstaticmethods1;
import nonstaticmethods.*;

public class nonstatic4
{
	public void lion()
	{
		System.out.println("non static method in different package");
	}
		 
		//Another method for different package
	
	public static void main(String[] args)
	{
		nonstatic2 tiger=new nonstatic2();
		tiger.furr();
	}
}
