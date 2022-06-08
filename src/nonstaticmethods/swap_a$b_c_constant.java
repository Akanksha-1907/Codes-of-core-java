package nonstaticmethods;

public class swap_a$b_c_constant
{
	public void naaz(int a,int b, int c)
	{
		System.out.println(+a+" "+b+" "+c);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(+a+" "+b+" "+c);
	}
	public static void main(String[] args)
	{
		swap_a$b_c_constant deo=new swap_a$b_c_constant();
		deo.naaz(2, 4, 6);
		
	}

}
