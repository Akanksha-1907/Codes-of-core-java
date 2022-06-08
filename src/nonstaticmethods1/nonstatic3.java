package nonstaticmethods1;

public class nonstatic3 
{
	public void scrum()
	{
		System.out.println("Non static method in different package");
	}
	public static void main(String[] args) 
	{
		nonstatic3 rat=new nonstatic3();
		rat.scrum();
		
		//syntax for differnt package=packagename.classname objectname=new methodname.classname
		
		nonstaticmethods.nonstatic2 mouse=new nonstaticmethods.nonstatic2();
		mouse.furr();
	}

}
