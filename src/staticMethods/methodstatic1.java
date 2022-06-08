package staticMethods;

public class methodstatic1 
{
	//method declare
	public static void Akanksha()
	{
		System.out.println("Welcome to Akanksha's world!");
		System.out.println("Hey!");
	}
	
	public static void Ashu()
	{
		System.out.println("............");
	}
	
    public static void main(String[] a)
    {
    	Akanksha();//given call to method 
    	Ashu();//call to a method
    	methodstatic2.Akanksha1();//given call to method from class methodstatic2 which is a different java program/class
    	Ashu();//reuse of method i.e. we can use it multiple times after declaration. 
    }    
    
}
