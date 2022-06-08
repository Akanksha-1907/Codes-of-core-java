package important_programs;

public class swap_2no_using_div_multi
{
	public static void q1(int a,int b)
	{
		System.out.println("Before Swapping- "+a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping- "+a+" "+b);
	
	}
	public static void main(String[] args)
	{
		q1(25,40);
		
	}

}
