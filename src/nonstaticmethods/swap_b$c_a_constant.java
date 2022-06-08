package nonstaticmethods;

public class swap_b$c_a_constant 
{
	public void roop(int a,int b, int c)
	{
		System.out.println(+a+" "+b+" "+c);
		b=b+c;
		c=b-c;
		b=b-c;
		c=c;
		System.out.println(+a+" "+b+" "+c);
	}
	public static void main(String[] args)
	{
		swap_b$c_a_constant deo1=new swap_b$c_a_constant();
		deo1.roop(4, 5, 6);
		
	}


}
