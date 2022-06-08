package nonstaticmethods;

public class nonstatic2
{
	public void furr()
	{
		System.out.println("Non static method in different class");
	}
	public static void main(String[] args) 
	{
		nonstatic2 oops=new nonstatic2();
		oops.furr();
		nonstatic1sameclass scooter=new nonstatic1sameclass();
		scooter.Ashu();
		
	}

}
