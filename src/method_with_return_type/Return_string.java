package method_with_return_type;

public class Return_string
{
	//program to return a string value.
	
	public String m2()
	{
		String str="Return a String Value";
		return str;
	}
	public void m3()
	{
		System.out.println("Calling m2 method in m3 method "+m2());
	}
	public static void main(String[] args) 
	{
		Return_string obj1=new Return_string();
		String s=obj1.m2();
		System.out.println(s);
		obj1.m3();
		
	}

}
