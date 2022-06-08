package trial;

public class a3 
{
	public static void rafter(int a, int b)
	{
		int cute;
		cute=a;
		a=b;
		b=cute;
		
		System.out.println("The numbers after swapping are ");
		System.out.println(+a+" "+b);
	}
	public static void main(String[] args) 
	{
		rafter(80,100);
	}

}
