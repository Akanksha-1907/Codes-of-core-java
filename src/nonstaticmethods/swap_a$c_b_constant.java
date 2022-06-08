package nonstaticmethods;

public class swap_a$c_b_constant 
{
	public void roop(int a,int b, int c)
	{
		System.out.println(+a+" "+b+" "+c);
		a=a+c;
		c=a-c;
		a=a-c;
		b=b;
		System.out.println(+a+" "+b+" "+c);
	}
	public static void main(String[] args)
	{
		swap_a$c_b_constant deo1=new swap_a$c_b_constant();
		deo1.roop(4, 5, 6);
		
	}


}
