package important_programs;

public class swap_2no_using_var
{
	public static void m1(int a,int b)
	{
		System.out.println("Before Swapping- " +a+" "+b);
		int var;
		var=a;
		a=b;
		b=var;
		System.out.println("After Swapping- " +a+" "+b);
		
	}
	public static void main(String[] args) 
	{
		m1(20,52);
		
	}
	

}
