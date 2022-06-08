package nonstaticmethods;

public class nonstatic1sameclass 
{
	//method declaration
	public void Ashu()       //non static method
	{
		System.out.println("Non Static method in same class");
	}
	public static void main(String[] args) 
	{
		//step 1- Object creation
		// syntax- classname abjectname= new classname();
		
		nonstatic1sameclass rose=new nonstatic1sameclass();
		
		//step 2- call the method
		//syntax- objectname.methodname();
		
		rose.Ashu();
		
	}

}