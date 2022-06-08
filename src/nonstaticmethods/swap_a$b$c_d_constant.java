package nonstaticmethods;

public class swap_a$b$c_d_constant 
{
	public void roop1(int a,int b, int c,int d)
	{
		System.out.println(+a+" "+b+" "+c+ " "+d);
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		d=d;
		System.out.println(+a+" "+b+" "+c+" "+d);
	}
	public static void main(String[] args)
	{
		swap_a$b$c_d_constant  deo1=new swap_a$b$c_d_constant();
		deo1.roop1(4, 5, 6,8);
		
	}

}
